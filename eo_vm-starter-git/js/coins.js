/**
 * Liste des types de pièces de monnaie acceptées par le distributeur.
 */
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
define(["require", "exports"], function (require, exports) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
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
    exports.Coin = Coin;
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
    exports.Quarter = Quarter;
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
    exports.Dime = Dime;
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
    exports.Half = Half;
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
    exports.Dollar = Dollar;
});
//# sourceMappingURL=coins.js.map