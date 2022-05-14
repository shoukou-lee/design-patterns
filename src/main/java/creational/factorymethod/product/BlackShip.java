package creational.factorymethod.product;

public class BlackShip extends Ship {

    private String options;

    public BlackShip(String orderer, String options) {
        super(orderer, "black");
        this.options = options;
    }

    @Override
    public String getOptions() {
        System.out.println("black ship options = " + options);
        return this.options;
    }

}
