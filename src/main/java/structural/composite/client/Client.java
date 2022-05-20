package structural.composite.client;

import structural.composite.component.Component;

public class Client {

    public int printPrice(Component component) {
        System.out.println("component.getPrice() = " + component.getPrice());

        return component.getPrice();
    }

    public String printName(Component component) {
        System.out.println("component.getName() = " + component.getName());

        return component.getName();
    }

}
