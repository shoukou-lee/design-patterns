package BehavioralPatterns.TemplateMethod.ConcreteClass;

import BehavioralPatterns.TemplateMethod.AbstractClass.Document;

public class DrawDocument extends Document {

    @Override
    public void save() {
        System.out.println("save DrawDocument");
    }

    @Override
    public void read() {
        System.out.println("read DrawDocument");
    }

    @Override
    public void open() {
        System.out.println("open DrawDocument");
    }

    @Override
    public void close() {
        System.out.println("close DrawDocument");
    }

    public DrawDocument(String name) {
        super.name = name;
    }

}
