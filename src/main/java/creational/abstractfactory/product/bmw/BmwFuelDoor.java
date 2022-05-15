package creational.abstractfactory.product.bmw;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.FuelDoor;

public class BmwFuelDoor extends DefaultParts implements FuelDoor {

    public BmwFuelDoor() {
        super("BMW");
    }

    @Override
    public void open() {
        System.out.println("Open BMW fuel door");
    }

    @Override
    public void close() {
        System.out.println("Close BMW fuel door");
    }

    @Override
    public void charge() {
        System.out.println("Charge fuel");
    }

}
