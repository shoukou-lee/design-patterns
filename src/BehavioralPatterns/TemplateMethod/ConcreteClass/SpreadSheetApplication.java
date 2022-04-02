package BehavioralPatterns.TemplateMethod.ConcreteClass;

import BehavioralPatterns.TemplateMethod.AbstractClass.Application;
import BehavioralPatterns.TemplateMethod.AbstractClass.Document;

public class SpreadSheetApplication extends Application {

    @Override
    protected Document createDocument(String name) {
        System.out.println("create SpreadSheetDocument");
        return new SpreadSheetDocument(name);
    }

    @Override
    protected Boolean canOpenDocument(String name) {
        if (name.contains("spreadsheet")) {
            return Boolean.TRUE;
        }
        throw new RuntimeException("this doc is not a SpreadSheetDocument");
    }

}
