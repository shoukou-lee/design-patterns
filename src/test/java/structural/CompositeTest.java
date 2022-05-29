package structural;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import structural.composite.client.Client;
import structural.composite.component.Component;
import structural.composite.composite.Cart;
import structural.composite.leaf.Item;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {

    @Test
    @DisplayName("Composite pattern에서, Client code는 단순히 Component 객체를 다룬다.")
    void run() {
        // given
        Cart cart = new Cart();
        Item kneeSleeves = new Item("KneeSleeves", 100);
        Item belt = new Item("Belt", 130);


        // when
        cart.addIntoCart(kneeSleeves);
        cart.addIntoCart(belt);

        Client client = new Client();
        client.printName(cart);
        client.printPrice(cart);

        client.printName(kneeSleeves);
        client.printPrice(kneeSleeves);

        // then
        assertThat(kneeSleeves.getPrice()).isEqualTo(100);
        assertThat(belt.getPrice()).isEqualTo(130);
        assertThat(cart.getPrice()).isEqualTo(230);

    }

}
