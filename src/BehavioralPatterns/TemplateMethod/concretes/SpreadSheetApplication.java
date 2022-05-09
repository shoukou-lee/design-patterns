package BehavioralPatterns.TemplateMethod.concretes;

import BehavioralPatterns.TemplateMethod.abstracts.Application;
import BehavioralPatterns.TemplateMethod.abstracts.Document;

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
