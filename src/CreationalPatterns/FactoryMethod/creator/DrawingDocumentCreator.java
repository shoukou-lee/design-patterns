package CreationalPatterns.FactoryMethod.creator;

import CreationalPatterns.FactoryMethod.product.DrawingDocument;

public class DrawingDocumentCreator extends DocumentCreator {

    @Override
    protected DrawingDocument createDocument() {
        return new DrawingDocument();
    }

}
