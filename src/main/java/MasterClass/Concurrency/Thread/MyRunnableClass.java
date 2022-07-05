package MasterClass.Concurrency.Thread;

import static MasterClass.Concurrency.Thread.ThreadColors.ANSI_RED;

public class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnableClass impl. of run()");
    }
}
