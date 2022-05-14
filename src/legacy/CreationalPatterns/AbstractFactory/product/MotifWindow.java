package CreationalPatterns.AbstractFactory.product;

public class MotifWindow implements Window {

    @Override
    public void exit() {
        System.out.println("[MotifWindow] exit");
    }

    @Override
    public void maximize() {
        System.out.println("[MotifWindow] maximize");
    }

    @Override
    public void minimize() {
        System.out.println("[MotifWindow] minimize");
    }

}
