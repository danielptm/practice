package practice;

interface Ex {
    boolean isNevative(int n);
}


public class Study {

    public void lambdas() {
//        Functional interface
        Ex l = i -> i < 0;
        System.out.println(String.format("Number is negative: %s", l.isNevative(3)));


    }
}
