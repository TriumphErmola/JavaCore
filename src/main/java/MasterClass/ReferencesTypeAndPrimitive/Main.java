package MasterClass.ReferencesTypeAndPrimitive;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int myIntValue = 10;
        int myAnotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myAnotherIntValue = " + myAnotherIntValue);
        System.out.println("+++++++++++++++++++++++++++++++++");

        myAnotherIntValue += 3;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myAnotherIntValue = " + myAnotherIntValue);
        System.out.println("+++++++++++++++++++++++++++++++++");

        myAnotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myAnotherIntValue = " + myAnotherIntValue);
        System.out.println("+++++++++++++++++++++++++++++++++");

        int[] myIntArray = new int[5];
        int[] myAnotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));
        System.out.println("+++++++++++++++++++++++++++++++++");


        myAnotherIntArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));
        System.out.println("+++++++++++++++++++++++++++++++++");

        myAnotherIntArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));
        System.out.println("+++++++++++++++++++++++++++++++++");

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1,2,3,4,5};
    }


}
