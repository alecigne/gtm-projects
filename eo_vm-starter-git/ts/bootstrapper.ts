import { VendingMachine, VendingMachineSize } from "./vending-machine";

const machine = new VendingMachine(VendingMachineSize.Medium);
ko.applyBindings(machine);