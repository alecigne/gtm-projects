/// <reference path="coins.ts"/>

/**
 * Fichier principal de l'application.
 */

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