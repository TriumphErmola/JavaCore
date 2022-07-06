package MasterClass.Concurrency.LiveLocks;

public class Main {

    public static void main(String[] args) {

        final ThreadWorker worker1 = new ThreadWorker("Andrey", true);
        final ThreadWorker worker2 = new ThreadWorker("Samurai", true);

        final ResourceForShared resourceForShared = new ResourceForShared(worker1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.opatRabota(resourceForShared, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.opatRabota(resourceForShared, worker1);
            }
        }).start();

    }
}
