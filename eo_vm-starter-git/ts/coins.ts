/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */

 class Quarter {
     private _value = 0.25;

     get value(): number {
         return this._value;
     }

     getImageUrl(): string {
         return "./img/Quarter.png";
     }
 }

 class Dime {
     private _value = 0.10;

     get value(): number {
         return this._value;
     }

     getImageUrl(): string {
         return "./img/Dime.png";
     }
 }

 class Half {
     private _value = 0.50;

     get value(): number {
         return this._value;
     }

     getImageUrl(): string {
         return "./img/Half.png";
     }
 }

 class Dollar {
     private _value = 1.00;

     get value(): number {
         return this._value;
     }

     getImageUrl(): string {
         return "./img/Dollar.jpg";
     }
 }