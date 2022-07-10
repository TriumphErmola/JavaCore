package LeetCode.ReverseInteger;

public class Solution {
    public static void main(String[] args) {

        int valueTest = reverse(228);
        System.out.println(valueTest);

    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int ostNumber = x % 10;
            x = x / 10;

            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && ostNumber > 7)) {
                return 0;
            }
            if ((result < Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10 && ostNumber < -8)) {
                return 0;
            }


            result = result * 10 + ostNumber;
        }

        return result;
    }
}
