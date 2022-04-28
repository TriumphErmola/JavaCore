package MasterClass.ParseString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//минимальное и максимально значения
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;
        List<Integer> arrayList = new ArrayList<>();

        while (true) {

            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

                arrayList.add(number);

            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();


        }
        System.out.println("min = " + min + ", max = " + max);
        System.out.println(arrayList);
        scanner.close();
    }
}
