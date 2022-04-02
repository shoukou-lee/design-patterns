package BehavioralPatterns.TemplateMethod.AbstractClass;

public abstract class Application {

    // TEMPLATE METHOD
    public Document openDocument(String name) {
        if (!canOpenDocument(name)) {
            throw new RuntimeException("cannot open document named " + name);
        }

        Document document = createDocument(name);

        document.open();
        document.read();

        // common primitive method intend to render a document
        render();

        return document;
    }

    // primitive methods
    protected abstract Document createDocument(String name);
    protected abstract Boolean canOpenDocument(String name);
    private void render() {
        System.out.println("Render any kind of document");
    }

}
