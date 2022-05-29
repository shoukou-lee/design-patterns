package behavioral;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import behavioral.observer.concretesubject.DefaultChatServer;
import behavioral.observer.concreteobserver.User;
import behavioral.observer.observer.Subscriber;
import behavioral.observer.subject.ChatServer;

public class ObserverTest {

    @Test
    @DisplayName("Observer pattern")
    void run() {
        Subscriber user = new User("shoukou");
        Subscriber user1 = new User("anonymous");
        ChatServer chatServer = new DefaultChatServer();

        chatServer.register("테슬라주주방", user);
        chatServer.register("테슬라주주방", user1);
        chatServer.sendMessage(user, "테슬라주주방", "아 ..");

        // given

        // when

        // then

    }
}
