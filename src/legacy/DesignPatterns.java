import BehavioralPatterns.Strategy.StrategyExampleRunner;
import BehavioralPatterns.TemplateMethod.TemplateMethodExampleRunner;
import CreationalPatterns.AbstractFactory.AbstractFactoryExampleRunner;
import CreationalPatterns.Builder.BuilderExampleRunner;
import CreationalPatterns.FactoryMethod.FactoryMethodExampleRunner;
import CreationalPatterns.Singleton.SingletonExampleRunner;
import Runner.ExampleRunner;
import StructuralPatterns.Decorator.DecoratorExampleRunner;
import StructuralPatterns.Proxy.ProxyExampleRunner;

public class DesignPatterns {
    public static void main(String[] args) {
        ExampleRunner runner = new FactoryMethodExampleRunner();
        runner.run();
    }
}
