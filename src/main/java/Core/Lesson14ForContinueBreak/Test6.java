package Core.Lesson14ForContinueBreak;

public class Test6 {

    public void time() {
        OUTHER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("nachalo outher loop");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                if (minute == 30) {
                    continue OUTHER;
                }
                System.out.println(hour + " : " + minute);
            }
            System.out.println("konec outher loop");
        }

    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.time();
    }
}
