package behavioral.templatemethod.concretes;

import behavioral.templatemethod.abstracts.FileProcessor;

public class LineAddProcessor extends FileProcessor {

    public LineAddProcessor(String path) {
        super(path);
    }

    @Override
    protected int getInitValue() {
        return 0;
    }

    @Override
    protected int operate(int result, int number) {
        return result += number;
    }
}
