package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.concretehandler.AuthenticationHandler;
import behavioral.chainofresponsibility.concretehandler.AuthorizationHandler;
import behavioral.chainofresponsibility.concretehandler.PrintRequestBodyHandler;
import behavioral.chainofresponsibility.handler.Request;
import behavioral.chainofresponsibility.handler.RequestHandler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    @DisplayName("Chain Of Responsibility")
    void run() {

        RequestHandler handler = new AuthenticationHandler(new AuthorizationHandler(new PrintRequestBodyHandler(null)));
        Request request = new Request("Body");
        handler.handle(request);

    }

}
