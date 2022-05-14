package creational.factorymethod.product;

public abstract class Ship {

    private String color;

    private String orderer;

    public Ship(String orderer, String color) {
        this.orderer = orderer;
        this.color = color;
    }

    public abstract String getOptions();

    // hook methods
    public String getColor() {
        return this.color;
    }

    public String getOrderer() {
        return this.orderer;
    }

}
