package threading;

class Runner1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++ ) {
            System.out.println("Runner1: " + i);
        }
    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Runner2: " + i);
        }
    }
}

public class Run {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runner1());
        Thread th2 = new Thread(new Runner2());
        th1.start();
        th2.start();
    }
}
