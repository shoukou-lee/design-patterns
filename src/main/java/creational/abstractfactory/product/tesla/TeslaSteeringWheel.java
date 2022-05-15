package creational.abstractfactory.product.tesla;

import creational.abstractfactory.product.DefaultParts;
import creational.abstractfactory.product.SteeringWheel;

public class TeslaSteeringWheel extends DefaultParts implements SteeringWheel {

    public TeslaSteeringWheel() {
        super("TESLA");
    }

    @Override
    public void steer() {
        System.out.println("Steering Tesla");
    }

}
