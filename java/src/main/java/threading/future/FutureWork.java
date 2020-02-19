package threading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Worker implements Callable{

    int i;

    public Worker(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "process: " + i;
    }
}


public class FutureWork {

    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            Future<String> future = exs.submit(new Worker(i));
            list.add(future);
        }


        for (int i = 0; i < list.size(); i++) {
            try {
                //Future represents the result of an async operation
                //If it hasn't resolved yet then .get() will block the thread until it's done.
                Future<String> fut = list.get(i);
                System.out.println(fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exs.shutdown();
    }

}
