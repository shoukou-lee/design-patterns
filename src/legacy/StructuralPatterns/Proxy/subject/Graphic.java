package StructuralPatterns.Proxy.subject;

import StructuralPatterns.Proxy.proxy.ImageProxy;

public interface Graphic {
    void draw();
    String getSize();

    static ImageProxy load(String fileName) {
        return new ImageProxy(fileName);
    }
}
