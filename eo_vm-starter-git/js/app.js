var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */
var Coin = /** @class */ (function () {
    function Coin() {
    }
    Object.defineProperty(Coin.prototype, "value", {
        get: function () {
            return this._value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Coin.prototype, "url", {
        get: function () {
            return this._url;
        },
        enumerable: true,
        configurable: true
    });
    return Coin;
}());
var Quarter = /** @class */ (function (_super) {
    __extends(Quarter, _super);
    function Quarter() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this._value = 0.25;
        _this._url = "./img/Quarter.png";
        return _this;
    }
    return Quarter;
}(Coin));
var Dime = /** @class */ (function (_super) {
    __extends(Dime, _super);
    function Dime() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this._value = 0.10;
        _this._url = "./img/Dime.png";
        return _this;
    }
    return Dime;
}(Coin));
var Half = /** @class */ (function (_super) {
    __extends(Half, _super);
    function Half() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this._value = 0.50;
        _this._url = "./img/Half.png";
        return _this;
    }
    return Half;
}(Coin));
var Dollar = /** @class */ (function (_super) {
    __extends(Dollar, _super);
    function Dollar() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this._value = 1;
        _this._url = "./img/Dollar.jpg";
        return _this;
    }
    return Dollar;
}(Coin));
/**
 * Liste des catégories de produits.
 */
var ProductCategory = /** @class */ (function () {
    function ProductCategory() {
    }
    return ProductCategory;
}());
var SodaCategory = /** @class */ (function (_super) {
    __extends(SodaCategory, _super);
    function SodaCategory() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = 'Soda';
        return _this;
    }
    SodaCategory.prototype.getImageUrl = function () {
        return 'img/SodaCan.png';
    };
    return SodaCategory;
}(ProductCategory));
var NutsCategory = /** @class */ (function (_super) {
    __extends(NutsCategory, _super);
    function NutsCategory() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = 'Nuts';
        return _this;
    }
    NutsCategory.prototype.getImageUrl = function () {
        return 'img/Nuts.png';
    };
    return NutsCategory;
}(ProductCategory));
var ChipsCategory = /** @class */ (function (_super) {
    __extends(ChipsCategory, _super);
    function ChipsCategory() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = 'Potato chips';
        return _this;
    }
    ChipsCategory.prototype.getImageUrl = function () {
        return 'img/Chips.png';
    };
    return ChipsCategory;
}(ProductCategory));
var CandyCategory = /** @class */ (function (_super) {
    __extends(CandyCategory, _super);
    function CandyCategory() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = 'Candy';
        return _this;
    }
    CandyCategory.prototype.getImageUrl = function () {
        return 'img/Candy.png';
    };
    return CandyCategory;
}(ProductCategory));
var CandyBarCategory = /** @class */ (function (_super) {
    __extends(CandyBarCategory, _super);
    function CandyBarCategory() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.name = 'Candy bar';
        return _this;
    }
    CandyBarCategory.prototype.getImageUrl = function () {
        return 'img/CandyBar.png';
    };
    return CandyBarCategory;
}(ProductCategory));
/// <reference path="categories.ts"/>
var Initial = /** @class */ (function () {
    function Initial() {
        this.name = 'Please select a product';
        this.price = 0;
    }
    return Initial;
}());
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
        var _this = this;
        this.total = ko.observable(0);
        this.acceptedCoins = [
            new Quarter(),
            new Dime(),
            new Half(),
            new Dollar()
        ];
        this.cells = [];
        this.selectedCell = ko.observable(new Cell(new Initial(), 0));
        this.canPay = ko.computed(function () {
            return _this.total() >= _this.selectedCell().product.price;
        });
        for (var i = 0; i < size; i++) {
            var cell = new Cell(getProduct(), 3);
            this.cells.push(cell);
        }
    }
    VendingMachine.prototype.acceptCoin = function (coin) {
        this.total(this.total() + coin.value);
    };
    VendingMachine.prototype.selectCell = function (cell) {
        this.selectedCell(cell);
        cell.sold(false);
    };
    VendingMachine.prototype.pay = function () {
        // Quitte si le produit est épuisé
        if (this.selectedCell().stock() < 1) {
            alert("Désolé, ce produit est épuisé");
            return;
        }
        // Déduit le prix du produit sélectionné du montant inséré dans la machine.
        var currentPayed = this.total();
        this.total(Math.round(((currentPayed - this.selectedCell().product.price) * 100)) / 100);
        // Retire une unité du stock du produit sélectionné
        var currentStock = this.selectedCell().stock();
        this.selectedCell().stock(currentStock - 1);
        // Déclenche une animation CSS
        this.selectedCell().sold(true);
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