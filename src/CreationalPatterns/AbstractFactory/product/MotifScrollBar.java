package CreationalPatterns.AbstractFactory.product;

public class MotifScrollBar implements ScrollBar {

    @Override
    public void scrollUp() {
        System.out.println("[MotifScrollBar] scroll up");
    }

    @Override
    public void scrollDown() {
        System.out.println("[MotifScrollBar] scroll down");
    }

}
