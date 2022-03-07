package CreationalPatterns.AbstractFactory.factory;

import CreationalPatterns.AbstractFactory.product.PresentationManagerScrollBar;
import CreationalPatterns.AbstractFactory.product.PresentationManagerWindow;
import CreationalPatterns.AbstractFactory.product.ScrollBar;
import CreationalPatterns.AbstractFactory.product.Window;

public class PresentationManagerWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PresentationManagerScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PresentationManagerWindow();
    }

}
