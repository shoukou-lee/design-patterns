package CreationalPatterns.AbstractFactory.factory;

import CreationalPatterns.AbstractFactory.product.MotifScrollBar;
import CreationalPatterns.AbstractFactory.product.MotifWindow;
import CreationalPatterns.AbstractFactory.product.ScrollBar;
import CreationalPatterns.AbstractFactory.product.Window;

public class MotifWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

}
