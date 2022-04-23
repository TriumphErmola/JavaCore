package MasterClass.ControlFlowStatement.Switch;

public class Test5 {
    public static void main(String[] args) {

        int count = 0; //счетчик для количества чисел
        int sum = 0;   //сумма чисел

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
