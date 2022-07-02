package MasterClass.Concurrency;

import static MasterClass.Concurrency.ThreadColors.ANSI_BLUE;

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
