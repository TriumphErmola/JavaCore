package MasterClass.AccessModifier;

public class Main {
    public static void main(String[] args) {

        Account andreyAccount = new Account("AndreyErmolenko");
        andreyAccount.deposit(50000);
        andreyAccount.withdraw(10000);
        andreyAccount.withdraw(-2000);
        andreyAccount.deposit(-5000);
        andreyAccount.deposit(15000);
        andreyAccount.calculateBalance();

        andreyAccount.balance = 15000;

        System.out.println("Balance on account is " + andreyAccount.getBalance());

    }
}
