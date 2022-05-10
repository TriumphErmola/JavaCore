package MasterClass.Collections.ArrayList;

import java.util.Scanner;

public class MainContact {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8 929 360 90 10");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nshutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
        scanner.close();
    }

    private static void addNewContact() {
        System.out.println("Enter new Contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add," + name + "already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add new contacts\n" +
                "3 - to update existing an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - queary if an existing contact\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choise your action:");
    }
}
