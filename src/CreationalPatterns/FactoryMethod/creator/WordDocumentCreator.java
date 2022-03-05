package CreationalPatterns.FactoryMethod.creator;

import CreationalPatterns.FactoryMethod.product.WordDocument;

public class WordDocumentCreator extends DocumentCreator {

    @Override
    protected WordDocument createDocument() {
        return new WordDocument();
    }

}
