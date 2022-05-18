package behavioral.chainofresponsibility.concretehandler;

import behavioral.chainofresponsibility.handler.Request;
import behavioral.chainofresponsibility.handler.RequestHandler;

public class AuthenticationHandler extends RequestHandler {

    public AuthenticationHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 시도");
        super.handle(request);
    }
}
