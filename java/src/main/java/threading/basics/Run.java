package threading.basics;

class Runner1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++ ) {
            System.out.println("Runner1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Runner2: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Basic multi thread practice
 */
public class Run {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runner1());
        Thread th2 = new Thread(new Runner2());
        th1.start();
        th2.start();
    }
}

/**
 * Practice with join.
 */
class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new Runner1());
        Thread th2 = new Thread(new Runner2());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("Printing after th1 and th2 join with the application thread.");
    }
}
