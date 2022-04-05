package JavaCore.Lesson15WhileDoWhile;

public class Test7 {
    public static void main(String[] args) {

        int money = 0;
        do {

            System.out.println("delayte stavku");
            System.out.println("vi proigrali");
            money -= 10;
            System.out.println(money);
        }
        while (money > 50);
        System.out.println("u vas malo deneg dla stavki!");
    }
}
