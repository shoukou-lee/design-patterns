package creational.factorymethod.creator;

import creational.factorymethod.product.Ship;

public interface ShipFactory {

    Ship create(String orderer, String options);

    int getOrderNumber();

}
