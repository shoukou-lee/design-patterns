package CreationalPatterns.FactoryMethod.product;

public class WordDocument implements Document {

    @Override
    public void openFile() {
        System.out.println("[WordDocument] open");
    }

    @Override
    public void closeFile() {
        System.out.println("[WordDocument] close");
    }

    @Override
    public void revertFile() {
        System.out.println("[WordDocument] revert");
    }

    @Override
    public void saveFile() {
        System.out.println("[WordDocument] save");
    }

}
