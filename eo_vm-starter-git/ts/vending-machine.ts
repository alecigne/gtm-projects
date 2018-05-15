/// <reference path="coins.ts"/>
/// <reference path="products.ts"/>

/**
 * Fichier principal de l'application.
 */

class Cell {
    product: any;
    stock = ko.observable(0);
    sold = ko.observable(false);
}

class VendingMachine {
    total = ko.observable(0);

    acceptedCoins = [
        new Quarter(),
        new Dime(),
        new Half(),
        new Dollar()
    ]

    acceptCoin(coin: any): void {
        this.total(this.total() + coin.value);
    }
}