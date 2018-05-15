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

    constructor(size: VendingMachineSize) {
        for (let i = 0; i < size; i++) {
            const cell = new Cell(getProduct(), 3);
            this.cells.push(cell);
        }
    }

    acceptCoin(coin: any): void {
        this.total(this.total() + coin.value);
    }
}