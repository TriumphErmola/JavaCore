package MasterClass.Concurrency.Starvation;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

//    private static Object lock1 = new Object();
    private static ReentrantLock lock1 = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadWorker(ThreadColors.ANSI_RED), "Priority 10");
        Thread thread2 = new Thread(new ThreadWorker(ThreadColors.ANSI_BLUE), "Priority 9");
        Thread thread3 = new Thread(new ThreadWorker(ThreadColors.ANSI_GREEN), "Priority 5");
        Thread thread4 = new Thread(new ThreadWorker(ThreadColors.ANSI_PURPLE), "Priority 3");
        Thread thread5 = new Thread(new ThreadWorker(ThreadColors.ANSI_BLACK), "Priority 2");

        thread1.setPriority(10);
        thread2.setPriority(8);
        thread3.setPriority(6);
        thread4.setPriority(4);
        thread5.setPriority(2);

        thread3.start();
        thread5.start();
        thread1.start();
        thread4.start();
        thread2.start();

    }

    private static class ThreadWorker implements Runnable {
        private int countWorker = 1;
        private String colorThread;

        public ThreadWorker(String colorThread) {
            this.colorThread = colorThread;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                lock1.lock();
                try{
                    System.out.format(colorThread + "%s: countWorker = %d\n",
                            Thread.currentThread().getName(), countWorker++);
                }finally{
                    lock1.unlock();
                }
            }
        }
    }


}
