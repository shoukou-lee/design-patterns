package StructuralPatterns.Decorator.decorator;

import StructuralPatterns.Decorator.component.TextVisualComponent;

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
