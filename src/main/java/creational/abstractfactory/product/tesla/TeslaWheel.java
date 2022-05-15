package creational.abstractfactory.product.tesla;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.Wheel;

public class TeslaWheel extends DefaultParts implements Wheel {

    public TeslaWheel() {
        super("TESLA");
    }

    @Override
    public void rotate() {
        System.out.println("rotate Tesla wheels");
    }

}
