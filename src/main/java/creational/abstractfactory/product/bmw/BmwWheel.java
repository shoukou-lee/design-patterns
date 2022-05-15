package creational.abstractfactory.product.bmw;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.Wheel;

public class BmwWheel extends DefaultParts implements Wheel {

    public BmwWheel() {
        super("BMW");
    }

    @Override
    public void rotate() {
        System.out.println("rotate BMW wheels");
    }

}
