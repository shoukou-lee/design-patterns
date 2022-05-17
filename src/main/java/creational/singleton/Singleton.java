package creational.singleton;

public class Singleton {

    private Singleton() { }

    // static inner class
    private static class SettingsHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // thread safe
    public static Singleton getInstance() {
        return SettingsHolder.INSTANCE;
    }

}
