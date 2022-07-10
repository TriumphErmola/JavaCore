package LeetCode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3, 4}, 3);
        System.out.println(Arrays.toString(ints));

    }


    public static int[] twoSum(int[] nums, int number) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = number - nums[i];
            if (integerMap.containsKey(requiredNumber) && integerMap.get(requiredNumber) != i) {
                return new int[]{i, integerMap.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException("Not solution");
    }
}
