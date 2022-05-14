package BehavioralPatterns.TemplateMethod;

import BehavioralPatterns.TemplateMethod.abstracts.Application;
import BehavioralPatterns.TemplateMethod.concretes.DrawApplication;
import BehavioralPatterns.TemplateMethod.concretes.SpreadSheetApplication;
import Runner.ExampleRunner;

public class TemplateMethodExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        Application app = new DrawApplication();
        app.openDocument("draw");

        app = new SpreadSheetApplication();
        app.openDocument("spreadsheet");
    }

}
