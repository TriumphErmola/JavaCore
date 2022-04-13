package MasterClass;

public class Test2 {
    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double multiplyValue = (firstValue + secondValue) * 100.00d;
        System.out.println("My values total : "+multiplyValue);
        double remainderResult = multiplyValue % 40.00d;
        System.out.println("remainderResult "+remainderResult);
        boolean isNotRemainder = (remainderResult == 0) ? true : false;
        System.out.println("isNotRemainder " + isNotRemainder);
        if (!isNotRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
