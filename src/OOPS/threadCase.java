package OOPS;

// Threads - Concurrent execution
// 1. Thread Class and 2. Runnable Interface
public class threadCase {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Thread Class
            threadCls obj = new threadCls("Thread", i);
            obj.start();
            // Runnable Interface
            Thread obj1 = new Thread(new runCls());
            obj1.start();

        }
    }
}

// By extending Thread Class
class threadCls extends Thread {
    private int count = 0;

    public threadCls(String name, int count) {
        super(name);
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("This is Thread!! ");
            System.out.println(count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// By Implementing Runnable Interface
class runCls implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello This Is Thread!!");
    }
}
