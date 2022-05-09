package BehavioralPatterns.TemplateMethod.concretes;

import BehavioralPatterns.TemplateMethod.abstracts.Application;
import BehavioralPatterns.TemplateMethod.abstracts.Document;

public class DrawApplication extends Application {

    @Override
    protected Document createDocument(String name) {
        System.out.println("create DrawDocument");
        return new DrawDocument(name);
    }

    @Override
    protected Boolean canOpenDocument(String name) {
        if (name.contains("draw")) {
            return Boolean.TRUE;
        }
        throw new RuntimeException("this doc is not a DrawDocument");
    }
}
