import SwimmerWalker.Swimmer;
import SwimmerWalker.Walker;
import Vehicle.Truck;

public class Main {

    public static void main(String[] args) {

        Multime m = new Multime(10);
        m.adauga(4);
        m.adauga(3);
        m.afisare();
        m.extrage(4);
        m.extrage(4);
        m.afisare();
        m.adauga(9);
        m.adauga(2);
        m.adauga(2);
        m.afisare();

        Truck truck = new Truck();
        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBrakes(1);
        truck.printState();

        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.printState();
        bus.applyBrakes(3);
        bus.printState();

        Walker walker = new Walker();
        Swimmer swimmer = new Swimmer();
        walker.breath();
        walker.walk();
        swimmer.swim();
        swimmer.breath();
    }
}
