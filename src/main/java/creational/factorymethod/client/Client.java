package creational.factorymethod.client;

import creational.factorymethod.creator.ShipFactory;
import creational.factorymethod.product.Ship;

public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Ship order(ShipFactory shipFactory, String options) {
        return shipFactory.create(name, options);
    }

}
