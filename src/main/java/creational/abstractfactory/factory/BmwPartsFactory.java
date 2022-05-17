package creational.abstractfactory.factory;

import creational.abstractfactory.product.FuelDoor;
import creational.abstractfactory.product.SteeringWheel;
import creational.abstractfactory.product.Wheel;
import creational.abstractfactory.product.bmw.BmwFuelDoor;
import creational.abstractfactory.product.bmw.BmwSteeringWheel;
import creational.abstractfactory.product.bmw.BmwWheel;

public class BmwPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {
        return new BmwWheel();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new BmwSteeringWheel();
    }

    @Override
    public FuelDoor createFuelDoor() {
        return new BmwFuelDoor();
    }

}
