package MasterClass.KeywordsandExpressions;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(36000));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
            return "invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        String durationString = getDurationString(minutes, remainingSeconds);
        return durationString;
    }


}
