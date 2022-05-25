package behavioral.templatemethod.concretes;

import behavioral.templatemethod.abstracts.FileProcessor;

public class LineMultiplyProcessor extends FileProcessor {

    public LineMultiplyProcessor(String path) {
        super(path);
    }

    @Override
    protected int getInitValue() {
        return 1;
    }

    @Override
    protected int operate(int result, int number) {
        return result *= number;
    }
}
