package MasterClass.Interface.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player andrey = new Player("Andrey", 10, 15);
        System.out.println(andrey);
        saveObjects(andrey);

        andrey.setHitPoints(25);
        System.out.println(andrey);

        andrey.setWeapon("Stormbringer");
        saveObjects(andrey);
//        loadObjects(andrey);
        System.out.println(andrey);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Приведение к Монстру " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObjects(werewolf);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }
        }
        return values;
    }

    public static void saveObjects(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObjects(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
