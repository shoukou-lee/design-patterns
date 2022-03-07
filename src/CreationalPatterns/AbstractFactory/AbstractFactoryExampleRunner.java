package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.factory.MotifWidgetFactory;
import CreationalPatterns.AbstractFactory.factory.PresentationManagerWidgetFactory;
import CreationalPatterns.AbstractFactory.factory.WidgetFactory;
import CreationalPatterns.AbstractFactory.product.ScrollBar;
import CreationalPatterns.AbstractFactory.product.Window;
import Runner.ExampleRunner;

public class AbstractFactoryExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        WidgetFactory widgetFactory = new MotifWidgetFactory();

        Window window = widgetFactory.createWindow();
        ScrollBar scrollBar = widgetFactory.createScrollBar();

        useWidget(window, scrollBar);

        widgetFactory = new PresentationManagerWidgetFactory();

        window = widgetFactory.createWindow();
        scrollBar = widgetFactory.createScrollBar();

        useWidget(window, scrollBar);
    }

    private void useWidget(Window window, ScrollBar scrollBar) {
        window.maximize();
        window.minimize();
        window.exit();
        scrollBar.scrollUp();
        scrollBar.scrollDown();
    }

}
