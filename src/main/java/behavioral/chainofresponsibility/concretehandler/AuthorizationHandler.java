package behavioral.chainofresponsibility.concretehandler;

import behavioral.chainofresponsibility.handler.Request;
import behavioral.chainofresponsibility.handler.RequestHandler;

public class AuthorizationHandler extends RequestHandler {

    public AuthorizationHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인가 시도");
        super.handle(request);
    }

}
