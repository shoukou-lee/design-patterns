package CreationalPatterns.Singleton;

public class App {

    public App() {
    }

    public void compareTwoSettings() {
        Settings a = Settings.getInstance();
        Settings b = Settings.getInstance();

        System.out.println(a == b);

    }

}
