package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {

        Semaphore callBox = new Semaphore(2);
        new Person("Andrey", callBox);
        new Person("Egor", callBox);
        new Person("Max", callBox);
        new Person("Artem", callBox);
        new Person("Grisha", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт ...");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном .");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
