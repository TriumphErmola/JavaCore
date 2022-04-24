package MasterClass.ParseString;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String stringOfScanner = scanner.next();
        String numberAsString = "2022";
//        int number = Integer.parseInt(stringOfScanner);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number - " + number);
        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
