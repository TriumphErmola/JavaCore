package MasterClass.KeywordsandExpressions;

public class TestSpeedConverterMain {

    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(100.5);
        System.out.println("Miles : " + miles);
        SpeedConverter.printConversion(miles);

    }
}
