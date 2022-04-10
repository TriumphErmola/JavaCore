package MasterClass;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min value - " + myMinIntValue);
        System.out.println("Max value - " + myMaxIntValue);
        System.out.println("Max value overflow - " + (myMaxIntValue + 1));
        System.out.println("Min value overflow - " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;
        System.out.println("==============================================");

    }
}
