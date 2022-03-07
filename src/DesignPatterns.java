import CreationalPatterns.AbstractFactory.AbstractFactoryExampleRunner;
import CreationalPatterns.Builder.BuilderExampleRunner;
import CreationalPatterns.FactoryMethod.FactoryMethodExampleRunner;
import Runner.ExampleRunner;

public class DesignPatterns {
    public static void main(String[] args) {
        ExampleRunner runner = new AbstractFactoryExampleRunner();
        runner.run();
    }
}
