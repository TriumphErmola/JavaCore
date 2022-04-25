package MasterClass.ParseString;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //перейти на новую строчку
            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;
            if (age > 0 && age < 100) {
                System.out.println("Your name : " + name + ", and you are " + age + " years old. ");
            } else {
                System.out.println("Invalid age value");
            }
        }else{
            System.out.println("Uncorrect value");
        }

        scanner.close();
    }
}
