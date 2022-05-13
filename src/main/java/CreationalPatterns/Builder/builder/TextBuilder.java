package CreationalPatterns.Builder.builder;

import CreationalPatterns.Builder.product.Text;

public interface TextBuilder {

    void buildCharacter(String character);
    void buildFont(Long fontType);
    void buildParagraph(Long paragraph);

    Text getText();
}
