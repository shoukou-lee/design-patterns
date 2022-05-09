package StructuralPatterns.Proxy.realsubject;

import StructuralPatterns.Proxy.subject.Graphic;

public class Image implements Graphic {

    private String fileName;
    private String size;

    public Image(String fileName) {
        this.fileName = fileName;
        this.size = "3840x2160";
    }

    @Override
    public void draw() {
        System.out.println("[RealSubject] Let's Draw !");
    }

    @Override
    public String getSize() {
        System.out.println("[RealSubject] this.size = " + this.size);
        return this.size;
    }

}
