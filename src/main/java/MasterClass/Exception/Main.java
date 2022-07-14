package MasterClass.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 89;
//        int y = 0;
//        System.out.println(divide(x, y));
//        System.out.println(divide1(x, y));
        int x = getIntEAP();
        System.out.println("x is : " + x);

    }

    private static int getIntEAP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException exp) {
            return 0;
        }

    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    private static int divide(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divide1(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException exp) {
            return 0;
        }
    }
}
