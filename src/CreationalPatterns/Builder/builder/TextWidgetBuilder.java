package CreationalPatterns.Builder.builder;

import CreationalPatterns.Builder.product.Text;

public class TextWidgetBuilder implements TextBuilder {

    private Text textWidget; // concrete builder에서는 product 접근을 private으로 막는다

    public TextWidgetBuilder() {
        textWidget = new Text();
    }

    @Override
    public void buildCharacter(String character) {
        textWidget.setCharacter(character);
    }

    @Override
    public void buildFont(Long fontType) {
        textWidget.setFontType(fontType);
    }

    @Override
    public void buildParagraph(Long paragraph) {
        textWidget.setParagraph(paragraph);
    }

    @Override
    public Text getText() {
        return textWidget;
    }
}
