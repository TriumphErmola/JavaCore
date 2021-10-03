package multithreading;

public class Ex1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyNewThread1());
        Thread thread2 = new Thread(new MyNewThread2());
        thread1.start();
        thread2.start();
    }

}

class MyNewThread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyNewThread2 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
