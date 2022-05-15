package creational.abstractfactory.product;

public abstract class DefaultParts implements Parts {

    private String manufacturer;

    public DefaultParts(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // hook methods
    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

}
