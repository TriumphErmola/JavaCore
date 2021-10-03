package multithreading;

public class Ex10Data_Race {
    public static void main(String[] args) {
        MyRunnableImpl1 runnableImpl1 = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnableImpl1);
        Thread thread2 = new Thread(runnableImpl1);
        Thread thread3 = new Thread(runnableImpl1);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter {
    static int counter = 0;
}

class MyRunnableImpl1 implements Runnable {

    public synchronized void increment() {
        Counter.counter++;
        System.out.println(Counter.counter + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
