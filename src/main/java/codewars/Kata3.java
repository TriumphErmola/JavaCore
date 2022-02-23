package codewars;
/*
public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    }
}
 */

import java.util.Arrays;

public class Kata3 {
    public static void main(String[] args) {
        double[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 6, 5, 4, 3, 2};
        Kata3.find_average(ints);
        double[] doubles = Arrays.stream(ints).toArray();

    }

//    public static double find_average(int[] array){
//        return Arrays.stream(array).average().orElse(0);
//    }


    public static double find_average(double[] array) {
        double avg = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            avg = sum / array.length;
        }
        return avg;
    }
}
