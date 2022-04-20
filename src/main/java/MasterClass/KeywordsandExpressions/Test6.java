package MasterClass.KeywordsandExpressions;

public class Test6 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(2599));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + remainingMinutes;
        }

        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + seconds;
        }


        return hoursString + " " + minutesString + " " + secondString + " ";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        String durationString = getDurationString(minutes, remainingSeconds);
        return durationString;
    }


}
