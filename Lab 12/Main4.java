import java.util.concurrent.Semaphore;

class SharedResource {
    private int count = 0;
    private Semaphore semaphore;

    public SharedResource(int permits) {
        semaphore = new Semaphore(permits);
    }

    public void increment() {
        try {
            semaphore.acquire();
            count++;
            System.out.println("Incremented by " + Thread.currentThread().getName() + ", Count: " + count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

class Worker implements Runnable {
    private SharedResource resource;

    public Worker(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.increment();
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(2);
        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(resource), "Thread-" + i).start();
        }
    }
}