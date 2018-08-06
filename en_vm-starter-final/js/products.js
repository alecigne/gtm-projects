define(["require", "exports", "./categories"], function (require, exports, categories_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var Initial = /** @class */ (function () {
        function Initial() {
            this.name = 'Please select a product';
            this.price = 0;
        }
        return Initial;
    }());
    exports.Initial = Initial;
    var CocaCola = /** @class */ (function () {
        function CocaCola() {
            this.name = 'Coca-Cola';
            this.price = 2.3;
            this.category = new categories_1.SodaCategory();
        }
        return CocaCola;
    }());
    var Fanta = /** @class */ (function () {
        function Fanta() {
            this.name = 'Fanta';
            this.price = 2;
            this.category = new categories_1.SodaCategory();
        }
        return Fanta;
    }());
    var Sprite = /** @class */ (function () {
        function Sprite() {
            this.name = 'Sprite';
            this.price = 1.80;
            this.category = new categories_1.SodaCategory();
        }
        return Sprite;
    }());
    var Peanuts = /** @class */ (function () {
        function Peanuts() {
            this.name = 'Peanuts';
            this.price = 1.50;
            this.category = new categories_1.NutsCategory();
        }
        return Peanuts;
    }());
    var Cashews = /** @class */ (function () {
        function Cashews() {
            this.name = 'Cashews';
            this.price = 2.80;
            this.category = new categories_1.NutsCategory();
        }
        return Cashews;
    }());
    var Plain = /** @class */ (function () {
        function Plain() {
            this.name = 'Plain';
            this.price = 2;
            this.category = new categories_1.ChipsCategory();
        }
        return Plain;
    }());
    var Cheddar = /** @class */ (function () {
        function Cheddar() {
            this.name = 'Cheddar';
            this.price = 2;
            this.category = new categories_1.ChipsCategory();
        }
        return Cheddar;
    }());
    var Mints = /** @class */ (function () {
        function Mints() {
            this.name = 'Mints';
            this.price = 1.30;
            this.category = new categories_1.CandyCategory();
        }
        return Mints;
    }());
    var Gummies = /** @class */ (function () {
        function Gummies() {
            this.name = 'Gummies';
            this.price = 1.90;
            this.category = new categories_1.CandyCategory();
        }
        return Gummies;
    }());
    var Hersey = /** @class */ (function () {
        function Hersey() {
            this.name = 'Hersey\'s';
            this.price = 1.30;
            this.category = new categories_1.CandyBarCategory();
        }
        return Hersey;
    }());
    var MilkyWay = /** @class */ (function () {
        function MilkyWay() {
            this.name = 'Milky Way';
            this.price = 1.80;
            this.category = new categories_1.CandyBarCategory();
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
    exports.getProduct = getProduct;
});
//# sourceMappingURL=products.js.map