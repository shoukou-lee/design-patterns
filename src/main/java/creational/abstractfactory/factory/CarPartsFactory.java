package creational.abstractfactory.factory;

import creational.abstractfactory.product.FuelDoor;
import creational.abstractfactory.product.SteeringWheel;
import creational.abstractfactory.product.Wheel;

public interface CarPartsFactory {

    Wheel createWheel();

    SteeringWheel createSteeringWheel();

    FuelDoor createFuelDoor();

}
