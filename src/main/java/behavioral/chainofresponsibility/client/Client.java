package behavioral.chainofresponsibility.client;

import behavioral.chainofresponsibility.concretehandler.AuthenticationHandler;
import behavioral.chainofresponsibility.concretehandler.AuthorizationHandler;
import behavioral.chainofresponsibility.concretehandler.PrintRequestBodyHandler;
import behavioral.chainofresponsibility.handler.Request;
import behavioral.chainofresponsibility.handler.RequestHandler;

public class Client {

    public static void main(String[] args) {
        RequestHandler handler = new AuthenticationHandler(new AuthorizationHandler(new PrintRequestBodyHandler(null)));
        Request request = new Request("Body");
        handler.handle(request);
    }

}
