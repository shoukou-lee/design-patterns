package behavioral.observer.concreteobserver;

import behavioral.observer.observer.Subscriber;

public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println("[" + this.name + "]" + message);
    }

}
