package CreationalPatterns.AbstractFactory.factory;

import CreationalPatterns.AbstractFactory.product.ScrollBar;
import CreationalPatterns.AbstractFactory.product.Window;

public interface WidgetFactory {

    ScrollBar createScrollBar();

    Window createWindow();

}
