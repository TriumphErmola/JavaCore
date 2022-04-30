package MasterClass.Classes;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String cutomerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(1, 2.5, "default", "default", "default");
        System.out.println("called empty constructor");

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999, 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(int accountNumber, double balance, String cutomerName, String email, String phoneNumber) {
        System.out.println("Account constructor with  pararmeters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.cutomerName = cutomerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds(double depositBalance) {
        this.balance += depositBalance;
        System.out.println("depositBalance of " + depositBalance + " proccesed.Remaining balance = " + balance);
    }

    public void withdrawFunds(double withdrawBalance) {
        if (this.balance - withdrawBalance < 0) {
            System.out.println("Недостаточно средств для операции");
        } else {
            this.balance -= withdrawBalance;
            System.out.println("withdrawal of " + withdrawBalance + " proccesed.Remaining balance = " + balance);
        }


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", cutomerName='" + cutomerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {

        BankAccount bankAccountAndrey = new BankAccount();
        bankAccountAndrey.setBalance(20000);
        System.out.println("=================");
        bankAccountAndrey.depositFunds(5000);
        System.out.println("=================");
        bankAccountAndrey.withdrawFunds(25000);
        System.out.println("=================");
        BankAccount bankAccountMark = new BankAccount("abc", "xram@", "123456");
        System.out.println(bankAccountMark);
    }
}
