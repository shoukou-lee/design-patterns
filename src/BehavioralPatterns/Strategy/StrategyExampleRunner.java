package BehavioralPatterns.Strategy;

import BehavioralPatterns.Strategy.context.Composition;
import BehavioralPatterns.Strategy.strategy.ArrayCompositor;
import BehavioralPatterns.Strategy.strategy.Compositor;
import BehavioralPatterns.Strategy.strategy.SimpleCompositor;
import BehavioralPatterns.Strategy.strategy.TexCompositor;
import Runner.ExampleRunner;

import java.util.List;

public class StrategyExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        System.out.println("--- Strategy Pattern ---");

        String lipsum =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus. Ultrices neque ornare aenean euismod elementum. Amet nisl purus in mollis. Quam viverra orci sagittis eu volutpat odio facilisis. Lectus nulla at volutpat diam ut venenatis tellus in. Platea dictumst vestibulum rhoncus est. Lacus vel facilisis volutpat est velit egestas dui. At urna condimentum mattis pellentesque id nibh. Nibh tortor id aliquet lectus proin nibh nisl. Aenean et tortor at risus viverra. Eget mi proin sed libero enim sed. Tortor posuere ac ut consequat. Urna id volutpat lacus laoreet non curabitur gravida arcu ac. Phasellus vestibulum lorem sed risus. Tristique nulla aliquet enim tortor at." +
                "\n" +
                "Justo laoreet sit amet cursus sit amet dictum sit amet. Sapien pellentesque habitant morbi tristique. Risus nullam eget felis eget nunc lobortis. Id faucibus nisl tincidunt eget. Lacus suspendisse faucibus interdum posuere lorem ipsum dolor sit. Volutpat odio facilisis mauris sit amet massa vitae tortor condimentum. Enim praesent elementum facilisis leo vel fringilla est ullamcorper eget. Adipiscing bibendum est ultricies integer quis auctor elit. Ultrices tincidunt arcu non sodales neque sodales ut etiam sit. Dictum at tempor commodo ullamcorper a lacus vestibulum sed. Iaculis eu non diam phasellus vestibulum lorem sed risus ultricies. Arcu dui vivamus arcu felis bibendum ut tristique et egestas. Ac odio tempor orci dapibus ultrices in iaculis nunc sed.";

        Composition composition = new Composition(lipsum);
        List<String> breakIntoLine = composition.linebreak();

        composition.setStrategy(new TexCompositor());
        List<String> breakIntoParagraph = composition.linebreak();

        composition.setStrategy(new ArrayCompositor());
        List<String> breakIntoSameCharWidth = composition.linebreak();

        printAll(breakIntoLine);
        printAll(breakIntoParagraph);
        printAll(breakIntoSameCharWidth);

    }

    private void printAll(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
