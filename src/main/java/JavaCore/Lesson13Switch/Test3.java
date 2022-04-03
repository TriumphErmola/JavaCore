package JavaCore.Lesson13Switch;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца для отображения количества дней : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        methodMonth(i);

    }

    static void methodMonth(int i) {

        switch (i) {
            case 1:
                System.out.println("Январь.31 дней");
                break;
            case 2:
                System.out.println("Фераль.28 дней");
                break;
            case 3:
                System.out.println("Март.31 дней");
                break;
            case 4:
                System.out.println("Апрель.30 дней");
                break;
            case 5:
                System.out.println("Май.31 дней");
                break;
            case 6:
                System.out.println("Июнь.30 дней");
                break;
            case 7:
                System.out.println("Июль.31 дней");
                break;
            case 8:
                System.out.println("Август.31 дней");
                break;
            case 9:
                System.out.println("Сентябрь.30 дней");
                break;
            case 10:
                System.out.println("Октябрь.31 дней");
                break;
            case 11:
                System.out.println("Ноябрь.30 дней");
                break;
            case 12:
                System.out.println("Декабрь.31 дней");
                break;
            default:
                System.out.println("Ты долбаёб????");
        }

    }
}


