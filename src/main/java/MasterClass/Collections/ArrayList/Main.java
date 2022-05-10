package MasterClass.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerList = new GroceryList();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void main(String[] args) {
        printInstructions();
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocerList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayListList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }

    }


    public static void addItem() {
        System.out.println("Please enter the grosery item");
        grocerList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name");
        String itemNumer = scanner.nextLine();
        System.out.println("Enter new item:");
        String newItem = scanner.nextLine();
        grocerList.modifyGroceryItem(itemNumer, newItem);

    }

    public static void removeItem() {
        System.out.println("Enter item name:");
        String itemDelete = scanner.nextLine();
        grocerList.removeGroceryList(itemDelete);
    }

    public static void searchForItem() {
        System.out.println("Enter item name for search:");
        String searchItemName = scanner.nextLine();
        if (grocerList.onFile(searchItemName)) {
            System.out.println("Found " + searchItemName + " in our grocery");
        } else {
            System.out.println(searchItemName + " is not found the shopping list");
        }
    }

    private static void processArrayListList() {
        //разные способы создания листов и массивов
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(grocerList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(grocerList.getGroceryList());

        String[] myArray = new String[grocerList.getGroceryList().size()];
        myArray = grocerList.getGroceryList().toArray(myArray);
    }
}
