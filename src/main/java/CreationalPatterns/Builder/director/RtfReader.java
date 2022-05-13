package CreationalPatterns.Builder.director;

import CreationalPatterns.Builder.builder.TextBuilder;
import CreationalPatterns.Builder.product.Text;

/**
 * @Director : constructs an object using the builder interface.
 */
public class RtfReader {

    private TextBuilder textBuilder;

    public RtfReader() {}

    public RtfReader(TextBuilder textBuilder) {
        this.textBuilder = textBuilder;
    }

    public Text construct(String character, Long fontType, Long paragraph) {
        textBuilder.buildCharacter(character);
        textBuilder.buildFont(fontType);
        textBuilder.buildParagraph(paragraph);

        return textBuilder.getText();
    }

    public void setTextBuilder(TextBuilder textBuilder) {
        this.textBuilder = textBuilder;
    }
}
