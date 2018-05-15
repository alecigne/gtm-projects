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
/**
 * Liste des catégories de produits.
 */
var SodaCategory = /** @class */ (function () {
    function SodaCategory() {
        this.name = 'Soda';
    }
    SodaCategory.prototype.getImageUrl = function () {
        return 'img/SodaCan.png';
    };
    return SodaCategory;
}());
var NutsCategory = /** @class */ (function () {
    function NutsCategory() {
        this.name = 'Nuts';
    }
    NutsCategory.prototype.getImageUrl = function () {
        return 'img/Nuts.png';
    };
    return NutsCategory;
}());
var ChipsCategory = /** @class */ (function () {
    function ChipsCategory() {
        this.name = 'Potato chips';
    }
    ChipsCategory.prototype.getImageUrl = function () {
        return 'img/Chips.png';
    };
    return ChipsCategory;
}());
var CandyCategory = /** @class */ (function () {
    function CandyCategory() {
        this.name = 'Candy';
    }
    CandyCategory.prototype.getImageUrl = function () {
        return 'img/Candy.png';
    };
    return CandyCategory;
}());
var CandyBarCategory = /** @class */ (function () {
    function CandyBarCategory() {
        this.name = 'Candy bar';
    }
    CandyBarCategory.prototype.getImageUrl = function () {
        return 'img/CandyBar.png';
    };
    return CandyBarCategory;
}());
/// <reference path="categories.ts"/>
/**
 * Liste des produits vendus dans le distributeur.
 */
var CocaCola = /** @class */ (function () {
    function CocaCola() {
        this.name = 'Coca-Cola';
        this.price = 2.3;
        this.category = new SodaCategory();
    }
    return CocaCola;
}());
var Fanta = /** @class */ (function () {
    function Fanta() {
        this.name = 'Fanta';
        this.price = 2;
        this.category = new SodaCategory();
    }
    return Fanta;
}());
var Sprite = /** @class */ (function () {
    function Sprite() {
        this.name = 'Sprite';
        this.price = 1.80;
        this.category = new SodaCategory();
    }
    return Sprite;
}());
var Peanuts = /** @class */ (function () {
    function Peanuts() {
        this.name = 'Peanuts';
        this.price = 1.50;
        this.category = new NutsCategory();
    }
    return Peanuts;
}());
var Cashews = /** @class */ (function () {
    function Cashews() {
        this.name = 'Cashews';
        this.price = 2.80;
        this.category = new NutsCategory();
    }
    return Cashews;
}());
var Plain = /** @class */ (function () {
    function Plain() {
        this.name = 'Plain';
        this.price = 2;
        this.category = new ChipsCategory();
    }
    return Plain;
}());
var Cheddar = /** @class */ (function () {
    function Cheddar() {
        this.name = 'Cheddar';
        this.price = 2;
        this.category = new ChipsCategory();
    }
    return Cheddar;
}());
var Mints = /** @class */ (function () {
    function Mints() {
        this.name = 'Mints';
        this.price = 1.30;
        this.category = new CandyCategory();
    }
    return Mints;
}());
var Gummies = /** @class */ (function () {
    function Gummies() {
        this.name = 'Gummies';
        this.price = 1.90;
        this.category = new CandyCategory();
    }
    return Gummies;
}());
var Hersey = /** @class */ (function () {
    function Hersey() {
        this.name = 'Hersey\'s';
        this.price = 1.30;
        this.category = new CandyBarCategory();
    }
    return Hersey;
}());
var MilkyWay = /** @class */ (function () {
    function MilkyWay() {
        this.name = 'Milky Way';
        this.price = 1.80;
        this.category = new CandyBarCategory();
    }
    return MilkyWay;
}());
function getProduct() {
    var random = Math.floor(Math.random() * 11);
    switch (random) {
        case 0: return new CocaCola();
        case 1: return new Fanta();
        case 2: return new Sprite();
        case 3: return new Peanuts();
        case 4: return new Cashews();
        case 5: return new Plain();
        case 6: return new Cheddar();
        case 7: return new Mints();
        case 8: return new Gummies();
        case 9: return new Hersey();
        case 10: return new MilkyWay();
    }
}
/// <reference path="coins.ts"/>
/// <reference path="products.ts"/>
/**
 * Fichier principal de l'application.
 */
var Cell = /** @class */ (function () {
    function Cell(product, stock) {
        this.product = product;
        this.stock = ko.observable(0);
        this.sold = ko.observable(false);
        this.stock(stock);
    }
    return Cell;
}());
var VendingMachineSize;
(function (VendingMachineSize) {
    VendingMachineSize[VendingMachineSize["Small"] = 6] = "Small";
    VendingMachineSize[VendingMachineSize["Medium"] = 9] = "Medium";
    VendingMachineSize[VendingMachineSize["Large"] = 12] = "Large";
})(VendingMachineSize || (VendingMachineSize = {}));
var VendingMachine = /** @class */ (function () {
    function VendingMachine(size) {
        this.total = ko.observable(0);
        this.acceptedCoins = [
            new Quarter(),
            new Dime(),
            new Half(),
            new Dollar()
        ];
        this.cells = [];
        for (var i = 0; i < size; i++) {
            var cell = new Cell(getProduct(), 3);
            this.cells.push(cell);
        }
    }
    VendingMachine.prototype.acceptCoin = function (coin) {
        this.total(this.total() + coin.value);
    };
    return VendingMachine;
}());
/// <reference path="vending-machine.ts"/>
var machine = new VendingMachine(VendingMachineSize.Medium);
ko.applyBindings(machine);
/***
 * Fonction factory qui renvoie des instances de produits aléatoirement.
 */
//# sourceMappingURL=app.js.map