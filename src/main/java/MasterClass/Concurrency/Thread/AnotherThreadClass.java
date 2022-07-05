package MasterClass.Concurrency.Thread;

import static MasterClass.Concurrency.Thread.ThreadColors.ANSI_BLUE;

public class AnotherThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from : " + currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exp) {
            System.out.println(ANSI_BLUE + "Another thread wake me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }

}
