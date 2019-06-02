package effective_java_practice.model;

public enum MySingleton3 {
    INSTANCE;

    public void sayHi() {
        System.out.println("hi");
    }

}
