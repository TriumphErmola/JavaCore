package codewars;

import java.util.ArrayList;
import java.util.List;

/*

int number = 0;
for (int bit : binary)
number = number << 1 | bit;
return number;
*****************************
int ans = 0;
for (int i = 0; i < binary.size(); i++) {
if (binary.get(i) == 1) ans += Math.pow(2,binary.size() - i - 1);
}
return ans;

 */

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(1);
        int i = ConvertBinaryArrayToInt(integerList);
        System.out.println(i);
    }


    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
