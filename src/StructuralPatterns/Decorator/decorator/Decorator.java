package StructuralPatterns.Decorator.decorator;

import StructuralPatterns.Decorator.component.TextVisualComponent;

public abstract class Decorator implements TextVisualComponent {

    protected TextVisualComponent visualComponent;

    public Decorator(TextVisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }
}
