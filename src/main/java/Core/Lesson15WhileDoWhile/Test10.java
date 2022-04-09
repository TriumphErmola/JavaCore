package Core.Lesson15WhileDoWhile;

public class Test10 {
    public static void main(String[] args) {
        OUTHER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }

        }
    }

}
