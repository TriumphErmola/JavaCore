package JavaCore.Lesson18Arrays;

public class Test4 {

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min element = " + min + " Max element = " + max);
    }

    public static void main(String[] args) {

        double[] array1 = {1.25, 3.14, 5.55, -3.14, 8.0, 9.19, -3.0};
        maxMin(array1);
        maxMin(new double[]{1.6, -7.8, 25.4});
    }

}
