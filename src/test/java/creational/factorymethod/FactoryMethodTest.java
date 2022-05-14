package creational.factorymethod;

import creational.factorymethod.client.Client;
import creational.factorymethod.creator.BlackShipFactory;
import creational.factorymethod.creator.ShipFactory;
import creational.factorymethod.creator.WhiteShipFactory;
import creational.factorymethod.product.Ship;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    void run() {
        ShipFactory factory = new BlackShipFactory();
        Ship ship = factory.create("shoukou", "four legs");

        assertThat(ship.getColor()).isEqualTo("black");
        assertThat(ship.getOrderer()).isEqualTo("shoukou");
        assertThat(ship.getOptions()).isEqualTo("four legs");
        assertThat(factory.getOrderNumber()).isEqualTo(1);

        factory = new WhiteShipFactory();
        ship = factory.create("shoukou", "four legs");

        assertThat(ship.getColor()).isEqualTo("white");
        assertThat(ship.getOrderer()).isEqualTo("shoukou");
        assertThat(ship.getOptions()).isEqualTo("four legs");
        assertThat(factory.getOrderNumber()).isEqualTo(1);
    }

    @Test
    void clientOrderShip() {
        Client client = new Client("shoukou");
        Ship ship = client.order(new BlackShipFactory(), "four legs");

        assertThat(ship.getOptions()).isEqualTo("four legs");
        assertThat(ship.getOrderer()).isEqualTo("shoukou");
        assertThat(ship.getColor()).isEqualTo("black");
    }

}
