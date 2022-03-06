package CreationalPatterns.Builder.builder;

import CreationalPatterns.Builder.product.Text;

public class AsciiBuilder implements TextBuilder {

    private Text ascii; // concrete builder에서는 product 접근을 private으로 막는다

    public AsciiBuilder() {
        ascii = new Text();
    }

    @Override
    public void buildCharacter(String character) {
        ascii.setCharacter(character);
    }

    @Override
    public void buildFont(Long fontType) {
        ascii.setFontType(null);
    }

    @Override
    public void buildParagraph(Long paragraph) {
        ascii.setParagraph(null);
    }

    @Override
    public Text getText() {
        return ascii;
    }
}
