/// <reference path="coins.ts"/>
/// <reference path="products.ts"/>

/**
 * Fichier principal de l'application.
 */

class Cell {
    stock = ko.observable(0);
    sold = ko.observable(false);
    constructor(public product: any, stock: number) {
        this.stock(stock);
    }
}

enum VendingMachineSize {
    Small = 6,
    Medium = 9,
    Large = 12
}

class VendingMachine {
    total = ko.observable(0);

    acceptedCoins = [
        new Quarter(),
        new Dime(),
        new Half(),
        new Dollar()
    ]

    cells: Cell[] = [];

    selectedCell: KnockoutObservable<Cell> = ko.observable(new Cell(new Initial(), 0));

    constructor(size: VendingMachineSize) {
        for (let i = 0; i < size; i++) {
            const cell = new Cell(getProduct(), 3);
            this.cells.push(cell);
        }
    }

    acceptCoin(coin: any): void {
        this.total(this.total() + coin.value);
    }

    selectCell(cell: Cell) {
        this.selectedCell(cell);
        cell.sold(false);
    }

    pay(): void {
        // Quitte si le produit est épuisé
        if (this.selectedCell().stock() < 1) {
            alert("Désolé, ce produit est épuisé");
            return;
        }

        // Déduit le prix du produit sélectionné du montant inséré dans la machine.
        const currentPayed = this.total();
        this.total(Math.round(((currentPayed - this.selectedCell().product.price) * 100)) / 100);

        // Retire une unité du stock du produit sélectionné
        const currentStock = this.selectedCell().stock();
        this.selectedCell().stock(currentStock - 1);

        // Déclenche une animation CSS
        this.selectedCell().sold(true);
    }

    canPay = ko.computed(() => {
        return this.total() >= this.selectedCell().product.price;
    });

}