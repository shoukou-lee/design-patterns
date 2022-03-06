package CreationalPatterns.Builder;

import CreationalPatterns.Builder.builder.AsciiBuilder;
import CreationalPatterns.Builder.builder.TexBuilder;
import CreationalPatterns.Builder.builder.TextWidgetBuilder;
import CreationalPatterns.Builder.director.RtfReader;
import CreationalPatterns.Builder.product.Text;
import Runner.ExampleRunner;

public class BuilderExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        System.out.println("--- Builder Pattern ---");

        // director
        RtfReader rtfReader = new RtfReader();

        // construct ascii product
        rtfReader.setTextBuilder(new AsciiBuilder());
        Text ascii = rtfReader.construct("Ascii format", 1L, 2L);
        printProperties(ascii);

        // construct tex product
        rtfReader.setTextBuilder(new TexBuilder());
        Text tex = rtfReader.construct("Tex format", 1L, 2L);
        printProperties(tex);

        // construct text widget product
        rtfReader.setTextBuilder(new TextWidgetBuilder());
        Text textWidget = rtfReader.construct("Text Widget format", 3L, 4L);
        printProperties(textWidget);
    }

    private void printProperties(Text text) {
        System.out.println("text.getCharacter() = " + text.getCharacter());
        System.out.println("text.getFontType() = " + text.getFontType());
        System.out.println("text.getParagraph() = " + text.getParagraph());
    }

}
