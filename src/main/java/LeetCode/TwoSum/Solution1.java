package LeetCode.TwoSum;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] twoSum(int[] numsArray, int number) {
        for (int i = 0; i < numsArray.length; i++) {
            for (int j = i + 1; j < numsArray.length; i++) {
                if (numsArray[j] == number - numsArray[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution for defined input date");
    }
}
