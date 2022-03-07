package CreationalPatterns.AbstractFactory.product;

public class PresentationManagerWindow implements Window {

    @Override
    public void exit() {
        System.out.println("[PresentationManagerWindow] exit");
    }

    @Override
    public void maximize() {
        System.out.println("[PresentationManagerWindow] maximize");
    }

    @Override
    public void minimize() {
        System.out.println("[PresentationManagerWindow] minimize");
    }

}
