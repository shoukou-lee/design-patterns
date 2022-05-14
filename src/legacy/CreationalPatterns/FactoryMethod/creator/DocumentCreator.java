package CreationalPatterns.FactoryMethod.creator;

import CreationalPatterns.FactoryMethod.product.Document;

public abstract class DocumentCreator {

    public Document createNewDocument() {
        return createDocument();
    }

    // factory method
    protected abstract Document createDocument();
}
