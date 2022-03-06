package CreationalPatterns.Builder.builder;

import CreationalPatterns.Builder.product.Text;

public class TexBuilder implements TextBuilder {

    private Text tex; // concrete builder에서는 product 접근을 private으로 막는다

    public TexBuilder() {
        tex = new Text();
    }

    @Override
    public void buildCharacter(String character) {
        tex.setCharacter(character);
    }

    @Override
    public void buildFont(Long fontType) {
        tex.setFontType(fontType);
    }

    @Override
    public void buildParagraph(Long paragraph) {
        tex.setParagraph(paragraph);
    }

    @Override
    public Text getText() {
        return tex;
    }
}
