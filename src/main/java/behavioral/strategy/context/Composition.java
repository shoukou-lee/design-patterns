package behavioral.strategy.context;

import behavioral.strategy.strategy.Compositor;
import behavioral.strategy.strategy.SimpleCompositor;

import java.util.List;

public class Composition {

    private Compositor strategy; // maintains a reference to a Strategy object.
    private final String textStream;

    // default strategy is set to 'SimpleCompositor'
    public Composition(String textStream) {
        this.strategy = new SimpleCompositor();
        this.textStream = textStream;
    }

    public Composition(Compositor strategy, String textStream) {
        this.strategy = strategy;
        this.textStream = textStream;
    }

    public void setStrategy(Compositor strategy) {
        this.strategy = strategy;
    }

    public List<String> linebreak() {
        return strategy.compose(textStream);
    }

}
