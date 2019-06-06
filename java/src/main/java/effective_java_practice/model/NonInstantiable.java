package effective_java_practice.model;

public class NonInstantiable {

    private NonInstantiable() {
        throw new AssertionError();
    }

    public static void sayHi() {
        System.out.println("hi");
    }


}
