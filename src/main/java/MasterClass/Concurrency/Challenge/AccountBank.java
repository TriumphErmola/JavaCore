package MasterClass.Concurrency.Challenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountBank {

    private double accountBalance;
    private String accountId;
    private Lock lock;

    public AccountBank(double accountBalance, String accountId) {
        this.accountBalance = accountBalance;
        this.accountId = accountId;
        this.lock = new ReentrantLock();
    }

//    public  synchronized void deposit(double cash) {
//        this.accountBalance += cash;
//        System.out.println("Balance after added : "+ this.accountBalance);
//    }
//
//    public synchronized void withdraw(double cash) {
//        this.accountBalance -= cash;
//        System.out.println("Balance after cleen: "+ this.accountBalance);
//    }

    public void deposit(double cash) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    accountBalance += cash;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException exp) {
        }
        System.out.println("Balance after added : " + this.accountBalance);
    }

//    public void deposit(double cash) {
//        lock.lock();
//        try {
//            accountBalance += cash;
//        } finally {
//            lock.unlock();
//        }
//        System.out.println("Balance after added : " + this.accountBalance);
//    }

    public void withdraw(double cash) {
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
                try {
                    accountBalance -= cash;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException exp) {
        }
        System.out.println("Balance after cleen: " + this.accountBalance);
    }
//    public void withdraw(double cash) {
//        lock.lock();
//        try {
//            accountBalance -= cash;
//        } finally {
//            lock.unlock();
//        }
//        System.out.println("Balance after cleen: " + this.accountBalance);
//    }

//    2 путь к норм потокобезопасности
//    public void withdraw(double cash) {
//        synchronized (this) {
//            this.accountBalance -= cash;
//            System.out.println("Balance after cleen: " + this.accountBalance);
//        }
//    }

    public String getAccountId() {
        return accountId;
    }

    public void printAccountId() {
        System.out.println("AccountId : " + accountId);
    }
}
