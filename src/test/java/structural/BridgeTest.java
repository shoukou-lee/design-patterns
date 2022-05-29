package structural;

import org.junit.jupiter.api.Test;
import structural.bridge.abstraction.GymRat;
import structural.bridge.concreteimplementor.BodyBuilder;
import structural.bridge.concreteimplementor.PowerLifter;
import structural.bridge.refinedabstraction.Barbell;
import structural.bridge.refinedabstraction.Dumbbell;
import structural.bridge.refinedabstraction.Machine;

public class BridgeTest {

    @Test
    void run() {
        GymRat lifter = new PowerLifter(new Machine());
        lifter.back();

        GymRat lifter2 = new PowerLifter(new Barbell());
        lifter2.chest();

        GymRat builder = new BodyBuilder(new Dumbbell());
        builder.lowerBody();
    }

}
