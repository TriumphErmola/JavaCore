package MasterClass.Concurrency;

import static MasterClass.Concurrency.ThreadColors.ANSI_BLUE;

public class AnotherThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from : " + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException exp) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and Im awake");
    }

}
