package creational.abstractfactory.product.bmw;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.SteeringWheel;

public class BmwSteeringWheel extends DefaultParts implements SteeringWheel {

    public BmwSteeringWheel() {
        super("BMW");
    }

    @Override
    public void steer() {
        System.out.println("Steering BMW");
    }

}
