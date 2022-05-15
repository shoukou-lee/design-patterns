package creational.abstractfactory.client;

import creational.abstractfactory.factory.CarPartsFactory;
import creational.abstractfactory.product.FuelDoor;
import creational.abstractfactory.product.SteeringWheel;
import creational.abstractfactory.product.Wheel;

public class CarFactory {

    private final CarPartsFactory partsFactory;

    public CarFactory(CarPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public Car create() {
        Wheel wheel = this.partsFactory.createWheel();
        SteeringWheel steeringWheel = this.partsFactory.createSteeringWheel();
        FuelDoor fuelDoor = this.partsFactory.createFuelDoor();

        return new Car(wheel, steeringWheel, fuelDoor);
    }


}
