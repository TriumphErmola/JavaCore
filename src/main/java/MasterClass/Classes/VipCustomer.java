package MasterClass.Classes;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(double creditLimit, String emailAddress) {
        this("default", creditLimit, emailAddress);

    }

    public VipCustomer() {
        this("defaultName", 250.0, "default@yandex.ru");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer("Andrey",10000,"kek");
        System.out.println(vipCustomer1.getCreditLimit());
        VipCustomer vipCustomer2 = new VipCustomer(350,"kek2");
        System.out.println(vipCustomer2.getName());
        VipCustomer vipCustomer3 = new VipCustomer();
        System.out.println(vipCustomer3.getEmailAddress());

    }
}
