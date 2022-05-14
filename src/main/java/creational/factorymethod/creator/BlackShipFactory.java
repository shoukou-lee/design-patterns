package creational.factorymethod.creator;

import creational.factorymethod.product.BlackShip;
import creational.factorymethod.product.Ship;

public class BlackShipFactory implements ShipFactory {

    private int orderNumber;

    public BlackShipFactory() {
        this.orderNumber = 0;
    }

    @Override
    public Ship create(String orderer, String options) {
        this.orderNumber++;
        return new BlackShip(orderer, options);
    }

    @Override
    public int getOrderNumber() {
        return this.orderNumber;
    }

}
