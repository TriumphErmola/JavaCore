package MasterClass.Concurrency.Counter;

public class Main {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountDownThread countDownThread1 = new CountDownThread(countDown);
        countDownThread1.setName("Thread 1");
        CountDownThread countDownThread2 = new CountDownThread(countDown);
        countDownThread2.setName("Thread 2");
        countDownThread1.start();
        countDownThread2.start();

    }
}


class CountDown {
    private int i;
    public  void doItCountDown() {
        String color;


        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColors.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColors.ANSI_BLUE;
                break;
            default:
                color = ThreadColors.ANSI_GREEN;
        }
        synchronized (this){
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }

    }
}

class CountDownThread extends Thread {
    private CountDown countDownThread;

    public CountDownThread(CountDown countDownthread) {
        this.countDownThread = countDownthread;
    }

    public void run() {
        countDownThread.doItCountDown();
    }
}
