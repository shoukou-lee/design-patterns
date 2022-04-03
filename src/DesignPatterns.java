import BehavioralPatterns.Strategy.StrategyExampleRunner;
import BehavioralPatterns.TemplateMethod.TemplateMethodExampleRunner;
import CreationalPatterns.AbstractFactory.AbstractFactoryExampleRunner;
import CreationalPatterns.Builder.BuilderExampleRunner;
import CreationalPatterns.FactoryMethod.FactoryMethodExampleRunner;
import Runner.ExampleRunner;
import StructuralPatterns.Decorator.DecoratorExampleRunner;

public class DesignPatterns {
    public static void main(String[] args) {
        ExampleRunner runner = new DecoratorExampleRunner();
        runner.run();
    }
}
