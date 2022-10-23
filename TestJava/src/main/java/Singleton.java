
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("单例不能被实例化");
        }
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private String name;

    public String getName() {
        return name;
    }
}
