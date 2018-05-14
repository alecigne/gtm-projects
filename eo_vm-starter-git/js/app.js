/**
 * Fichier principal de l'application.
 */
var VendingMachine = /** @class */ (function () {
    function VendingMachine() {
    }
    VendingMachine.prototype.acceptCoin = function (coin) {
        this.total += coin.value;
        document.getElementById('total').textContent = this.total.toString();
    };
    return VendingMachine;
}());
/// <reference path="vending-machine.ts"/>
var machine = new VendingMachine();
/**
 * Liste des catégories de produits.
 */
/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */
var Quarter = /** @class */ (function () {
    function Quarter() {
        this._value = 0.25;
    }
    Object.defineProperty(Quarter.prototype, "value", {
        get: function () {
            return this._value;
        },
        enumerable: true,
        configurable: true
    });
    Quarter.prototype.getImageUrl = function () {
        return "./img/Quarter.png";
    };
    return Quarter;
}());
var Dime = /** @class */ (function () {
    function Dime() {
        this._value = 0.10;
    }
    Object.defineProperty(Dime.prototype, "value", {
        get: function () {
            return this._value;
        },
        enumerable: true,
        configurable: true
    });
    Dime.prototype.getImageUrl = function () {
        return "./img/Dime.png";
    };
    return Dime;
}());
var Half = /** @class */ (function () {
    function Half() {
        this._value = 0.50;
    }
    Object.defineProperty(Half.prototype, "value", {
        get: function () {
            return this._value;
        },
        enumerable: true,
        configurable: true
    });
    Half.prototype.getImageUrl = function () {
        return "./img/Half.png";
    };
    return Half;
}());
var Dollar = /** @class */ (function () {
    function Dollar() {
        this._value = 1.00;
    }
    Object.defineProperty(Dollar.prototype, "value", {
        get: function () {
            return this._value;
        },
        enumerable: true,
        configurable: true
    });
    Dollar.prototype.getImageUrl = function () {
        return "./img/Dollar.jpg";
    };
    return Dollar;
}());
/***
 * Fonction factory qui renvoie des instances de produits aléatoirement.
 */
/**
 * Liste des produits vendus dans le distributeur.
 */
//# sourceMappingURL=app.js.map