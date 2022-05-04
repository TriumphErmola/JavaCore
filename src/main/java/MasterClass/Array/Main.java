package MasterClass.Array;

public class Main {
    public static void main(String[] args) {


        int[] myIntArray = new int[22];
        myIntArray[8] = 10;
        myIntArray[0] = 10;
        myIntArray[1] = 10;
        myIntArray[3] = 10;
        myIntArray[4] = 10;
        myIntArray[7] = 10;
        myIntArray[5] = 10;


        double[] myDoubleArray = new double[15];
        myDoubleArray[3] = 15;


        double[] myDoubleArray1 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < myDoubleArray1.length; i++) {
            myDoubleArray1[i] *= 10;
        }


        for (int i = 0; i < myIntArray.length; i++)
            System.out.println(i + " element : " + myIntArray[i]);

        for (int i = 0; i < myDoubleArray1.length; i++) {
            System.out.println(i + " element : " + myDoubleArray1[i]);
        }


    }

}
