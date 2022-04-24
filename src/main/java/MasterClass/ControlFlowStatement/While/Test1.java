package MasterClass.ControlFlowStatement.While;

public class Test1 {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println(count);
            count++;
        }
        count = 6;
        do {
            System.out.println("value = " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);


    }
}
