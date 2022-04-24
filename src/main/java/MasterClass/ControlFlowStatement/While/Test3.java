package MasterClass.ControlFlowStatement.While;

public class Test3 {
    public static void main(String[] args) {

        int intDigits = sumDigits(237);
        System.out.println(intDigits);
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            sum += digit;
            number /= 10;

        }
        return sum;
    }
}
