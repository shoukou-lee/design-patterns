package StructuralPatterns.Decorator.Decorator;

import StructuralPatterns.Decorator.Component.TextVisualComponent;

public abstract class Decorator implements TextVisualComponent {

    protected TextVisualComponent visualComponent;

    public Decorator(TextVisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }
}
