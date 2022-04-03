package StructuralPatterns.Decorator.Component;

import java.util.ArrayList;
import java.util.List;

public class TextView implements TextVisualComponent {

    private int lineWidth;
    private String text;

    @Override
    public void draw() {
        List<String> strings = lineSplit(text);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Override
    public int getLineWidth() {
        return lineWidth;
    }

    private List<String> lineSplit(String textStream) {
        List<String> newTextStream = new ArrayList<>();

        for (int i = 0; i < textStream.length(); i += lineWidth + 1) {
            int end = Math.min(i + lineWidth, textStream.length());
            newTextStream.add(textStream.substring(i, end));
        }

        return newTextStream;
    }

    public TextView(String text, int lineWidth) {
        this.text = text;
        this.lineWidth = lineWidth;
    }

}
