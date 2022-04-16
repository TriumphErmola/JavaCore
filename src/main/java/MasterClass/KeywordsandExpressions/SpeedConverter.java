package MasterClass.KeywordsandExpressions;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return (long) kilometersPerHour;
    }


    public static void printConversion(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour * 0.621371d;
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
    }

    public static void main(String[] args) {
        long toMilesPerHour = toMilesPerHour(15);
        printConversion(toMilesPerHour);
    }
}


