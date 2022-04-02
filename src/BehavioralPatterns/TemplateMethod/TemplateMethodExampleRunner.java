package BehavioralPatterns.TemplateMethod;

import BehavioralPatterns.TemplateMethod.AbstractClass.Application;
import BehavioralPatterns.TemplateMethod.ConcreteClass.DrawApplication;
import BehavioralPatterns.TemplateMethod.ConcreteClass.SpreadSheetApplication;
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
