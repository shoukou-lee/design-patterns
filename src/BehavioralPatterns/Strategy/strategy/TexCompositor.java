package BehavioralPatterns.Strategy.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// concrete strategy
public class TexCompositor implements Compositor {

    // algorithm implementation using regex
    @Override
    public List<String> compose(String textStream) {
        return Arrays.asList(textStream.split("\n"));
    }
}
