/// <reference path="vending-machine.ts"/>

const machine = new VendingMachine(VendingMachineSize.Medium);
ko.applyBindings(machine);