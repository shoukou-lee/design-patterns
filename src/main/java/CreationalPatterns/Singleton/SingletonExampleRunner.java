package CreationalPatterns.Singleton;

import Runner.ExampleRunner;

public class SingletonExampleRunner implements ExampleRunner {

    @Override
    public void run() {
        App app = new App();

        app.compareTwoSettings();
    }
}
