package multithreading;

public class Ex12 {

    static final Object lock = new Object();

    void callPhone() {
        synchronized (lock) {
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call end");
        }

    }

    void scypePhone() {
        synchronized (lock) {
            System.out.println("Scype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Scype call end");
        }

    }

    void whatsappPhone() {
        synchronized (lock) {
            System.out.println("Whatsapp call start");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsapp call end");
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mobilerunable());
        Thread thread2 = new Thread(new Scyperunable());
        Thread thread3 = new Thread(new Whatsrunable());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Mobilerunable implements Runnable {

    @Override
    public void run() {
        new Ex12().callPhone();
    }
}

class Scyperunable implements Runnable {

    @Override
    public void run() {
        new Ex12().scypePhone();
    }
}

class Whatsrunable implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsappPhone();
    }
}

