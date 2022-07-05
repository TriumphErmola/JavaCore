package MasterClass.Concurrency.Thread;

import static MasterClass.Concurrency.Thread.ThreadColors.*;

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
                try {
                    thread1.join();
                    System.out.println(ANSI_RED + "Thread1 terminated, or timed out, so I'm running again");
                } catch (InterruptedException exp) {
                    System.out.println(ANSI_RED + "I couldn't wait after all.I was interrupted ");
                }
            }
        });
        myRunnableThread.start();
        thread1.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from Main Thread");


    }
}
