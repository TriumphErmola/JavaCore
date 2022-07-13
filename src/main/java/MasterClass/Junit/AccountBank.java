package MasterClass.Junit;

public class AccountBank {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHEKING = 1;
    public static final int SAVING = 2;

    private int accountType;


    public AccountBank(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    public double withdrow(double amount, boolean branch) {
        if ((amount > 500) && !branch) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isCheking() {
        return accountType == CHEKING;
    }

}
