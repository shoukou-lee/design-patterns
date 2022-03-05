package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.creator.DocumentCreator;
import CreationalPatterns.FactoryMethod.creator.DrawingDocumentCreator;
import CreationalPatterns.FactoryMethod.creator.WordDocumentCreator;
import CreationalPatterns.FactoryMethod.product.Document;
import Runner.ExampleRunner;

public class FactoryMethodExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        System.out.println("--- Factory Method Pattern ---");

        DocumentCreator drawingDocumentCreator = new DrawingDocumentCreator();
        Document drawingDocument = drawingDocumentCreator.createNewDocument();

        drawingDocument.openFile();
        drawingDocument.closeFile();
        drawingDocument.revertFile();
        drawingDocument.saveFile();

        DocumentCreator wordDocumentCreator = new WordDocumentCreator();
        Document wordDocument = wordDocumentCreator.createNewDocument();

        wordDocument.openFile();
        wordDocument.closeFile();
        wordDocument.revertFile();
        wordDocument.saveFile();
    }

}
