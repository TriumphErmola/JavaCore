package multithreading;

public class VolatileEx extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finish, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("after 3 sec it is time wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}

