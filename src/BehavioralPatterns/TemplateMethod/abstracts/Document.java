package BehavioralPatterns.TemplateMethod.abstracts;

public abstract class Document {

    protected String name;

    public abstract void save();
    public abstract void read();
    public abstract void open();
    public abstract void close();

    public String getName() {
        return this.name;
    }

}
