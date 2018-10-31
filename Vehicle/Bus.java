package Vehicle;

public class Bus extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Vehicle.Vehicle.Bus state: " + "speed " + getSpeed() + " gear " + getGear());
    }
}
