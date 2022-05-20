package structural.composite.composite;

import structural.composite.component.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart implements Component {

    private List<Component> components;

    public Cart() {
        this.components = new ArrayList<>();
    }

    /**
     * 장바구니 목록의 모든 가격 총합 리턴
     */
    @Override
    public int getPrice() {
        return this.components.stream()
                .mapToInt(Component::getPrice)
                .sum();
    }

    @Override
    public String getName() {
        return this.components.stream()
                .map(c -> c.getName())
                .collect(Collectors.toList())
                .toString();
    }

    public void addIntoCart(Component component) {
        this.components.add(component);
    }

    public void removeItem(Component component) {
        this.components.remove(component);
    }
}
