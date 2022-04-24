package MasterClass.ControlFlowStatement.While;

public class Test2 {
    public static void main(String[] args) {

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Event number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Event number " + number);
            count++;
            if (count >= 5) {
                break;
            }

        }
        System.out.println("Total Eventnumbers " + count);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
