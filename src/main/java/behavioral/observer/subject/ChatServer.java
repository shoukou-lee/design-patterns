package behavioral.observer.subject;

import behavioral.observer.observer.Subscriber;

public interface ChatServer {

    void register(String channel, Subscriber subscriber);

    void unregister(String channel, Subscriber subscriber);

    void sendMessage(Subscriber user, String channel, String message);

}
