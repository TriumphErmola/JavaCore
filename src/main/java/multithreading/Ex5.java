package multithreading;

public class Ex5 implements Runnable {

    @Override
    public void run() {
        System.out.println("Method Run.Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex5());
        thread.start();
        System.out.println("Method Main.Thread name = " + Thread.currentThread().getName());
    }
}
