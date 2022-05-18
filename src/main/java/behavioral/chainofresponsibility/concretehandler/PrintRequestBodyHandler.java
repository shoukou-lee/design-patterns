package behavioral.chainofresponsibility.concretehandler;

import behavioral.chainofresponsibility.handler.Request;
import behavioral.chainofresponsibility.handler.RequestHandler;

public class PrintRequestBodyHandler extends RequestHandler {

    public PrintRequestBodyHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("request.getBody() = " + request.getBody());
        super.handle(request);
    }
}
