package JavaCore.Lesson18Arrays;

public class Test1 {
    public static void main(String[] args) {
//      declaration
        int[] array1;
        double[][] array2;
        String[] array3;
        double[] array7;


        int[][] array4 = new int[12][12];


//        allocation
        array1 = new int[8];
        array2 = new double[4][2];
        array3 = new String[3];
        array7 = new double[2];



        array3[0] = "privet";
        array3[1] = "poka";
        array3[2] = "kak dela?";

        array2[0][0] = 3.14;
        array2[2][1] = 3.14;
        double[] array5;

        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array7 = array5;


    }
}
