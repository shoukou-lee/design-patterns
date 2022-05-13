package BehavioralPatterns.TemplateMethod.concretes;

import BehavioralPatterns.TemplateMethod.abstracts.Document;

public class SpreadSheetDocument extends Document {
    @Override
    public void save() {
        System.out.println("save SpreadSheetDocument");
    }

    @Override
    public void read() {
        System.out.println("read SpreadSheetDocument");
    }

    @Override
    public void open() {
        System.out.println("open SpreadSheetDocument");
    }

    @Override
    public void close() {
        System.out.println("close SpreadSheetDocument");
    }

    public SpreadSheetDocument(String name) {
        super.name = name;
    }
}
