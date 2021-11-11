package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println("Введенное число : "+i);

//        System.out.println("Введите два числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное двух чисел равно : "+x/y);
//        System.out.println("Остаток двух чисел равен : "+x%y);

//        System.out.println("Напишите строку");
//        String s = scanner.next();
//        System.out.println("Вы написали в первой строке: " + s);

        Scanner scanner1 = new Scanner("Привет мой друг!\nКак поживаешь?\nKak tvoi dela?");
        String s1 = scanner1.nextLine();
        System.out.println(s1);
        System.out.println(scanner1.nextLine());
        System.out.println(scanner1.nextLine());


    }
}
