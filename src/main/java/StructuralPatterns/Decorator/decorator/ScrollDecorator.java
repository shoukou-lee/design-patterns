package StructuralPatterns.Decorator.decorator;

import StructuralPatterns.Decorator.component.TextVisualComponent;

public class ScrollDecorator extends Decorator {

    private int borderWidth;

    public ScrollDecorator(TextVisualComponent visualComponent) {
        super(visualComponent);
        this.borderWidth = visualComponent.getLineWidth();
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
        this.drawScroll();
    }

    @Override
    public int getLineWidth() {
        return visualComponent.getLineWidth();
    }

    private void drawScroll() {
        System.out.println("<=>");
        String scroll = "";
        for (int i = 0; i < visualComponent.getLineWidth(); i++) {
            scroll += "=";
        }
        System.out.println(scroll);
    }


}
