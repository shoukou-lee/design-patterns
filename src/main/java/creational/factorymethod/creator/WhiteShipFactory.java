package creational.factorymethod.creator;

import creational.factorymethod.product.Ship;
import creational.factorymethod.product.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private int orderNumber;

    public WhiteShipFactory() {
        this.orderNumber = 0;
    }

    @Override
    public Ship create(String orderer, String options) {
        this.orderNumber++;
        return new WhiteShip(orderer, options);
    }

    @Override
    public int getOrderNumber() {
        return this.orderNumber;
    }

}
