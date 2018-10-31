package Vehicle;

import Vehicle.Vehicle;

public class Truck extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Vehicle.Truck state: " + "speed " + getSpeed() + " gear " + getGear());
    }
}
