package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegersEx {
    //    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
//        counter++;
//        counter.incrementAndGet();
        counter.getAndAdd(-5);

    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl3());
        Thread thread2 = new Thread(new MyRunnableImpl3());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImpl3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegersEx.increment();
        }
    }
}
