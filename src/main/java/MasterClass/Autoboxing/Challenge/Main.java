package MasterClass.Autoboxing.Challenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Alfa-Bank");

        if (bank.addBranch("Orsk")) {
            System.out.println("Orsk branch created");
        }

        bank.addCustomer("Orsk", "Victor", 150.55);
        bank.addCustomer("Orsk", "ivan", 145.35);
        bank.addCustomer("Orsk", "Petr", 152.75);

        bank.addBranch("Omsk");
        bank.addCustomer("Omsk", "Andrey", 999.99);


        bank.addCustomerTransaction("Orsk", "Victor", 44.44);
        bank.addCustomerTransaction("Orsk", "ivan", 14.44);
        bank.addCustomerTransaction("Orsk", "Victor", 24.44);

        bank.listCustomers("Orsk", true);
        bank.listCustomers("Omsk", true);

        bank.addBranch("Novosibirsk");

        if (!bank.addCustomer("Novosibirsk", "Egor", 10.55)) {
            System.out.println("Error Novosibirsk branch does not exist");
        }
        if (!bank.addBranch("Orsk")) {
            System.out.println("Orsk branch already exists");
        }
    }
}
