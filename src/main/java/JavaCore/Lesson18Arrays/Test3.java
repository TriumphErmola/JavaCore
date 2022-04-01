package JavaCore.Lesson18Arrays;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int[] array1 = {1, 3, -5, 3, 7, 6, 9, 2, -6};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        Arrays.sort(array1);
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int i = Arrays.binarySearch(array1, -6);
        System.out.println(i);
    }
}
