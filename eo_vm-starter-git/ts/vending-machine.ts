/// <reference path="coins.ts"/>

/**
 * Fichier principal de l'application.
 */

 class VendingMachine {
     total = 0;

     acceptCoin(coin: any): void {
        this.total += coin.value;
        document.getElementById('total').textContent = this.total.toString();
     }
 }