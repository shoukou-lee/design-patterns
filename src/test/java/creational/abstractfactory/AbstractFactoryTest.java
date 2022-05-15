package creational.abstractfactory;

import creational.abstractfactory.client.Car;
import creational.abstractfactory.client.CarFactory;
import creational.abstractfactory.factory.BmwPartsFactory;
import creational.abstractfactory.factory.TeslaPartsFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

    @Test
    void run() {

        CarFactory bmwFactory = new CarFactory(new BmwPartsFactory());
        Car bmw = bmwFactory.create();

        assertThat(bmw.getFuelDoor().getManufacturer()).isEqualTo("BMW");
        assertThat(bmw.getWheel().getManufacturer()).isEqualTo("BMW");
        assertThat(bmw.getSteeringWheel().getManufacturer()).isEqualTo("BMW");

        CarFactory teslaFactory = new CarFactory(new TeslaPartsFactory());
        Car tesla = teslaFactory.create();

        assertThat(tesla.getFuelDoor().getManufacturer()).isEqualTo("TESLA");
        assertThat(tesla.getWheel().getManufacturer()).isEqualTo("TESLA");
        assertThat(tesla.getSteeringWheel().getManufacturer()).isEqualTo("TESLA");
    }

}
