package behavioral.strategy.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// concrete strategy
public class SimpleCompositor implements Compositor {

    // algorithm implementation using regex
    @Override
    public List<String> compose(String textStream) {
        String newTextStream = textStream.replaceAll("\\.\\s", "\\.\n");

        return Arrays.asList(newTextStream.split("\n"));
    }
}
