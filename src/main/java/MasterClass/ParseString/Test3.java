package MasterClass.ParseString;

import java.util.Scanner;
//сумма 10 чисел
public class Test3 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number #" + count + ":");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            while (true) {
                count++;
                int nextInt = scanner.nextInt();
                sum += nextInt;
                if (count == 10) {
                    break;
                }
            }

        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
