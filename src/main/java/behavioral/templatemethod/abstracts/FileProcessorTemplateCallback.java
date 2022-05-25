package behavioral.templatemethod.abstracts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessorTemplateCallback {

    private String path;

    public FileProcessorTemplateCallback(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = -2147483648;

            String line = null;
            while ((line = br.readLine()) != null) {
                result = operator.operate(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }

}
