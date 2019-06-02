package effective_java_practice.model;

public class MySingleton2 {
    private static final MySingleton2 MY_SINGLETON_2 = new MySingleton2();

    private MySingleton2() {

    }

    public static MySingleton2 getInstance() {
        return MY_SINGLETON_2;
    }
}
