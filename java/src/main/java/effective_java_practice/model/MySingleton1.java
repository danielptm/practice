package effective_java_practice.model;

public class MySingleton1 implements Cloneable {

    public static final MySingleton1 MY_SINGLETON_1 = new MySingleton1();

    private MySingleton1() {}

    public void sayHi(){
        System.out.println("hi");
    }

}
