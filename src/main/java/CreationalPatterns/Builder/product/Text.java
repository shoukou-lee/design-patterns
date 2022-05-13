package CreationalPatterns.Builder.product;

public class Text {
    private String character;
    private Long fontType;
    private Long paragraph;

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setFontType(Long fontType) {
        this.fontType = fontType;
    }

    public void setParagraph(Long paragraph) {
        this.paragraph = paragraph;
    }

    public String getCharacter() {
        return character;
    }

    public Long getFontType() {
        return fontType;
    }

    public Long getParagraph() {
        return paragraph;
    }
}
