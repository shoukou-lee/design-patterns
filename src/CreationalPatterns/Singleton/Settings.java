package CreationalPatterns.Singleton;

public class Settings {

    private Settings() { }

    // static inner class
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    // thread safe
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

}
