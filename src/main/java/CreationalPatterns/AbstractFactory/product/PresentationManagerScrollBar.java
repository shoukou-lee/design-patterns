package CreationalPatterns.AbstractFactory.product;

public class PresentationManagerScrollBar implements ScrollBar {

    @Override
    public void scrollUp() {
        System.out.println("[PresentationManagerScrollBar] scroll up");
    }

    @Override
    public void scrollDown() {
        System.out.println("[PresentationManagerScrollBar] scroll down");
    }

}
