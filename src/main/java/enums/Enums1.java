package enums;

import java.util.Arrays;

public class Enums1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
        System.out.println(today.weekDays);
//        WeekDays w1 = WeekDays.FRIDAY;
//        WeekDays w2 = WeekDays.FRIDAY;
//        WeekDays w3 = WeekDays.FRIDAY;
//        System.out.println(w1 == w3);
        System.out.println(WeekDays.FRIDAY.equals(Today.WeekDays2.FRIDAY));
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);
        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na raboti!!!!!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Otdihaem ji est!");
        }
        System.out.println("Nastroenie v etot den : " + weekDays.getMood());
    }

    enum WeekDays2 {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

    }
}
