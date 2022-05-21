package behavioral.observer.observer;

public interface Subscriber {

    public String getName();

    void handleMessage(String message);

}
