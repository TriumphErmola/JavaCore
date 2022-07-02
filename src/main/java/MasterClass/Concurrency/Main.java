package MasterClass.Concurrency;

import static MasterClass.Concurrency.ThreadColors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main Thread");

        Thread thread1 = new AnotherThreadClass();
        thread1.setName("==Another Thread==");
        thread1.run();
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnableClass() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from Anonymous class impl. of run()");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from Main Thread");


    }
}
