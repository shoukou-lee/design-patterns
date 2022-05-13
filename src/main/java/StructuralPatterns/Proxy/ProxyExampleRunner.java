package StructuralPatterns.Proxy;

import Runner.ExampleRunner;
import StructuralPatterns.Proxy.proxy.ImageProxy;
import StructuralPatterns.Proxy.subject.Graphic;

public class ProxyExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        ImageProxy image = Graphic.load("image-file.png");

        image.getFileName();
        image.getSize();
        image.draw();
        image.getFileName();

    }
}
