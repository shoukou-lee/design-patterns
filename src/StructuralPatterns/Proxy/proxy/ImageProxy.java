package StructuralPatterns.Proxy.proxy;

import StructuralPatterns.Proxy.realsubject.Image;
import StructuralPatterns.Proxy.subject.Graphic;

public class ImageProxy implements Graphic {

    private String fileName;
    private String size;
    private Image image;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        this.size = null;
        this.image = null;
    }

    public String getFileName() {
        System.out.println("[Proxy] fileName = " + fileName);
        return this.fileName;
    }

    @Override
    public void draw() {
        getImage().draw();
    }

    @Override
    public String getSize() {
        if (this.size == null) {
            this.size = getImage().getSize();
        }
        return this.size;
    }

    protected Image getImage() {
        if (image == null) {
            System.out.println("[Proxy] getImage()");
            this.image = new Image(fileName);
        }
        return this.image;
    }

}
