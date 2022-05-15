package creational.abstractfactory.factory;

import creational.abstractfactory.product.FuelDoor;
import creational.abstractfactory.product.SteeringWheel;
import creational.abstractfactory.product.Wheel;
import creational.abstractfactory.product.tesla.TeslaFuelDoor;
import creational.abstractfactory.product.tesla.TeslaSteeringWheel;
import creational.abstractfactory.product.tesla.TeslaWheel;

public class TeslaPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {
        return new TeslaWheel();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new TeslaSteeringWheel();
    }

    @Override
    public FuelDoor createFuelDoor() {
        return new TeslaFuelDoor();
    }
}
