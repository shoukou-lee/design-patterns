package CreationalPatterns.FactoryMethod.product;

public class DrawingDocument implements Document {

    @Override
    public void openFile() {
        System.out.println("[DrawingDocument] open");
    }

    @Override
    public void closeFile() {
        System.out.println("[DrawingDocument] close");
    }

    @Override
    public void revertFile() {
        System.out.println("[DrawingDocument] revert");
    }

    @Override
    public void saveFile() {
        System.out.println("[DrawingDocument] save");
    }

}
