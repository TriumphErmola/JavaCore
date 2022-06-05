package MasterClass.StaticStatement;

public class Main {

    public static int multiplier = 10;

    public static void main(String[] args) {

        int answer = multiply(6);
        System.out.println("the answer is " + answer);
        System.out.println("the multiplier is " + multiplier);
//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName()+"is instance number "+ StaticTest.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName()+"is instance number "+ StaticTest.getNumInstance());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName()+"is instance number "+ StaticTest.getNumInstance());
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
