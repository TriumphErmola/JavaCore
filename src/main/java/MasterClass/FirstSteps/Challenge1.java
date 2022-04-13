package MasterClass.FirstSteps;

public class Challenge1 {
    public static void main(String[] args) {

        byte byteValue = 120;
        short shortValue = 25000;
        int intValue = 100000;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);

        short shortTotal = (short) (5000 + 100 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
