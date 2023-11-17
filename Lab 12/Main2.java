class Buffer {
    private Integer value = null;

    public synchronized void put(int value) throws InterruptedException {
        while (this.value != null) {
            wait();
        }
        this.value = value;
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (this.value == null) {
            wait();
        }
        int value = this.value;
        this.value = null;
        notify();
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.put(i);
                System.out.println("Produced: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Consumed: " + buffer.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Thread(new Producer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}