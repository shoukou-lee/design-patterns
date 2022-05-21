package behavioral.observer.concretesubject;

import behavioral.observer.observer.Subscriber;
import behavioral.observer.subject.ChatServer;

import java.util.*;

public class DefaultChatServer implements ChatServer {

    Map<String, List<Subscriber>> subscribers = new HashMap<>();

    @Override
    public void register(String channel, Subscriber subscriber) {
        if (this.subscribers.containsKey(channel)) {
            this.subscribers.get(channel).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(channel, list);
        }
    }

    @Override
    public void unregister(String channel, Subscriber subscriber) {
        if (this.subscribers.containsKey(channel)) {
            this.subscribers.get(channel).remove(subscriber);
        }
    }

    @Override
    public void sendMessage(Subscriber user, String channel, String message) {
        if (this.subscribers.containsKey(channel)) {
            String msg = user.getName() + " : " + message;
            this.subscribers.get(channel)
                    .forEach(s -> s.handleMessage(msg));
        }
    }
}
