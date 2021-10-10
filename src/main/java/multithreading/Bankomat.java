package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Andrey",lock);
        new Employee("Egor",lock);
        new Employee("Maxim",lock);
        new Employee("Vika",lock);
        new Employee("Elena",lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт...");
        lock.lock();
        System.out.println("Работник: " + name + " пользуется банкоматом");
        try {
            Thread.sleep(2000);
            System.out.println("Работник: " + name + " перестал пользоваться банкоматом");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }
}
