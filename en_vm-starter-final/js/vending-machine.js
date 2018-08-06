define(["require", "exports", "./products", "./coins"], function (require, exports, products_1, coins_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
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
    })(VendingMachineSize = exports.VendingMachineSize || (exports.VendingMachineSize = {}));
    var VendingMachine = /** @class */ (function () {
        function VendingMachine(size) {
            var _this = this;
            // total: number = 0;
            this.total = ko.observable(0);
            // LIRE LA VALEUR : this.total();
            // ECRIRE LA VALEUR : this.total(NEW_TOTAL)
            // Liste des pièces acceptées
            this.acceptedCoins = [
                new coins_1.Quarter(),
                new coins_1.Dime(),
                new coins_1.Half(),
                new coins_1.Dollar()
            ];
            this.cells = [];
            this.selectedCell = ko.observable(new Cell(new products_1.Initial(), 0));
            this.canPay = ko.computed(function () {
                return _this.total() >= _this.selectedCell().product.price;
            });
            for (var i = 0; i < size; i++) {
                var cell = new Cell(products_1.getProduct(), 3);
                this.cells.push(cell);
            }
        }
        VendingMachine.prototype.acceptCoin = function (coin) {
            this.total(this.total() + coin.value);
            // Sans knockout
            // this.total += coin.value;
            // document.getElementById('total').textContent = this.total.toString();
            // Autre possibilités
            // document.getElementById('total').textContent = `this.total`;
            // document.getElementById('total').textContent = String(this.total);
        };
        /*     acceptCoin(coin: Quarter | Dime | Half | Dollar): void {
                this.total += coin.value;
            } */
        VendingMachine.prototype.selectCell = function (cell) {
            console.log('selectCell', cell);
            this.selectedCell(cell);
            // Permet de répéter l'animation de chute
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
    exports.VendingMachine = VendingMachine;
});
//# sourceMappingURL=vending-machine.js.map