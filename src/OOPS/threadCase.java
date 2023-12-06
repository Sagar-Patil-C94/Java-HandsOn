package OOPS;

// Threads - Concurrent execution
// 1. Thread Class and 2. Runnable Interface
public class threadCase {
    public static void main(String[] args) {
        System.out.println("Running outside the thread...");
        for (int i = 0; i < 10; i++) {
            myCls obj = new myCls();
            obj.start();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class myCls extends Thread {
    static int count = 0;

    @Override
    public void run() {
        myCls.count++;
        System.out.println("Running In The Thread");
        System.out.println(count);
    }
}
