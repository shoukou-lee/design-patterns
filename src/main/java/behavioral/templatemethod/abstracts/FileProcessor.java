package behavioral.templatemethod.abstracts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = getInitValue();

            String line = null;
            while ((line = br.readLine()) != null) {
                result = operate(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }

    protected abstract int getInitValue();
    protected abstract int operate(int result, int number);
}
