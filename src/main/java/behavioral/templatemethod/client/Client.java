package behavioral.templatemethod.client;

import behavioral.templatemethod.abstracts.FileProcessor;
import behavioral.templatemethod.abstracts.FileProcessorTemplateCallback;
import behavioral.templatemethod.abstracts.Operator;
import behavioral.templatemethod.concretes.LineAddProcessor;
import behavioral.templatemethod.concretes.LineMultiplyProcessor;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new LineMultiplyProcessor("src/main/java/behavioral/templatemethod/number.txt");
        int result = fileProcessor.process();
        System.out.println("process = " + result);

        FileProcessorTemplateCallback templateCallback = new FileProcessorTemplateCallback("src/main/java/behavioral/templatemethod/number.txt");
        int result2 = templateCallback.process((num1, num2) -> Math.max(num1, num2));
        System.out.println("process = " + result2);

    }

}
