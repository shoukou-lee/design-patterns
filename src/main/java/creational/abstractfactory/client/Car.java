package creational.abstractfactory.client;

import creational.abstractfactory.product.FuelDoor;
import creational.abstractfactory.product.SteeringWheel;
import creational.abstractfactory.product.Wheel;

public class Car {

    private Wheel wheel;
    private SteeringWheel steeringWheel;
    private FuelDoor fuelDoor;

    public Car(Wheel wheel, SteeringWheel steeringWheel, FuelDoor fuelDoor) {
        this.wheel = wheel;
        this.steeringWheel = steeringWheel;
        this.fuelDoor = fuelDoor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public FuelDoor getFuelDoor() {
        return fuelDoor;
    }
}
