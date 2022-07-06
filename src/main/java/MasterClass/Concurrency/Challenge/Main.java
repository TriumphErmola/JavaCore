package MasterClass.Concurrency.Challenge;

public class Main {
    public static void main(String[] args) {

        final AccountBank accountBank = new AccountBank(1000.0, "19031994");


//        Thread thread1 = new Thread() {
//            @Override
//            public void run() {
//                accountBank.deposit(300.00);
//                accountBank.withdraw(50.00);
//            }
//        };
//        Thread thread2 = new Thread() {
//            @Override
//            public void run() {
//                accountBank.deposit(250);
//                accountBank.withdraw(215);
//            }
//        };
        //1 путь к норм потокобезопасности

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                accountBank.deposit(300);
                accountBank.withdraw(250);
                accountBank.printAccountId();
            }
        });

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                accountBank.deposit(300);
//                accountBank.withdraw(250);
//                accountBank.getAccountId();
//                accountBank.printAccountId();
//            }
//        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                accountBank.deposit(500);
                accountBank.withdraw(800);
                accountBank.printAccountId();
            }
        });
        thread1.start();
        thread2.start();
    }
}
