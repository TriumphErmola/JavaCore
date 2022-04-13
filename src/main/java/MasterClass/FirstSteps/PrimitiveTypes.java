package MasterClass.FirstSteps;

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

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMAxByteValue = Byte.MAX_VALUE;
        System.out.println("MyMinByteValue - " + MyMinByteValue);
        System.out.println("MyMAxByteValue - " + MyMAxByteValue);
        System.out.println("==============================================");

        short MyMinShortValue = Short.MIN_VALUE;
        short MyMAxShortValue = Short.MAX_VALUE;
        System.out.println("MyMinShortValue - " + MyMinShortValue);
        System.out.println("MyMAxShortValue - " + MyMAxShortValue);
        System.out.println("==============================================");

        long MyMinLongValue = Long.MIN_VALUE;
        long MyMAxLongValue = Long.MAX_VALUE;
        long myMaxLongTest = 1000L;
        long myMaxLongValue = 2_147_483_647_123L;
        System.out.println("MyMinLongValue - " + MyMinLongValue);
        System.out.println("MyMAxLongValue - " + MyMAxLongValue);

        byte myNewByteValue = (byte) (MyMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (MyMinShortValue / 2);
        System.out.println(myNewShortValue);


    }
}
