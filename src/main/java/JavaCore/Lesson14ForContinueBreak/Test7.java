package JavaCore.Lesson14ForContinueBreak;

public class Test7 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        OUTHER:
        for (int hour = 0; hour <= 5; hour++) {
            MIDDLE:
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTHER;
                }
                INNER:
                for (int seconds = 0; seconds <= 59; seconds++) {
                    if (seconds * hour > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                }
            }
        }
    }
}
