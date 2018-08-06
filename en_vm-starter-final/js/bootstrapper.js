define(["require", "exports", "./vending-machine"], function (require, exports, vending_machine_1) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var machine = new vending_machine_1.VendingMachine(vending_machine_1.VendingMachineSize.Medium);
    ko.applyBindings(machine);
});
//# sourceMappingURL=bootstrapper.js.map