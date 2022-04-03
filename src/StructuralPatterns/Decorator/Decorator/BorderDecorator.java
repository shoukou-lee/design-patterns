package StructuralPatterns.Decorator.Decorator;

import StructuralPatterns.Decorator.Component.TextVisualComponent;

public class BorderDecorator extends Decorator {
    private int borderWidth;

    public BorderDecorator(TextVisualComponent visualComponent) {
        super(visualComponent);
        this.borderWidth = 10;
    }

    @Override
    public void draw() {
        this.drawBorder();
        this.visualComponent.draw();
        this.drawBorder();
    }

    @Override
    public int getLineWidth() {
        return visualComponent.getLineWidth();
    }

    private void drawBorder() {
        String border = "";
        for (int i = 0; i < visualComponent.getLineWidth(); i++) {
            border += "-";
        }
        System.out.println(border);
    }

}
