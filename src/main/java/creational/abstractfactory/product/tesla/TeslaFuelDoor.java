package creational.abstractfactory.product.tesla;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.FuelDoor;

public class TeslaFuelDoor extends DefaultParts implements FuelDoor {

    public TeslaFuelDoor() {
        super("TESLA");
    }

    @Override
    public void open() {
        System.out.println("Open Tesla fuel door");
    }

    @Override
    public void close() {
        System.out.println("Close Tesla fuel door");
    }

    @Override
    public void charge() {
        System.out.println("Charge Batteries");
    }

}
