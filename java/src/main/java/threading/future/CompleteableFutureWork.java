package threading.future;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class CompleteableWorker implements Callable {

    int i;

    public CompleteableWorker(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "process: " + i;
    }
}

public class CompleteableFutureWork {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Allow you to chain aysnc operations together without watiing for one to finish
        //Allows you to also pass the result from one thing to the next.
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World")
                .thenApply(s -> s + "!");

        System.out.println(future.get()); //Hello World!

    }
}
