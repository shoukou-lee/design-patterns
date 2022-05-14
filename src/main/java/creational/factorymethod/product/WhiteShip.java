package creational.factorymethod.product;

public class WhiteShip extends Ship {

    private String options;

    public WhiteShip(String orderer, String options) {
        super(orderer, "white");
        this.options = options;
    }

    @Override
    public String getOptions() {
        System.out.println("white ship options = " + options);
        return this.options;
    }

}
