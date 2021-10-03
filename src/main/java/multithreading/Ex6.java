package multithreading;

public class Ex6 {
    public static void main(String[] args) {
        Kek1 thread1 = new Kek1();
        Kek2 thread2 = new Kek2();

        thread1.start();
        thread2.start();
    }
}

class Kek1 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class Kek2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
