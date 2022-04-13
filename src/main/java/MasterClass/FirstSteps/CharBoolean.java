package MasterClass.FirstSteps;

public class CharBoolean {
    public static void main(String[] args) {

        char MyChar = 'D';
        char MyUnicodeChar = '\u0044';
        char MyUnicodeChar1 = '\u00AC';
        char MyUnicodeChar2 = '\u1488';
//        System.out.println(MyChar);
//        System.out.println(MyUnicodeChar);
//        System.out.println(MyUnicodeChar1);
//        System.out.println(MyUnicodeChar2);
        boolean MyTrueBooleanValue = true;
        boolean MyFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        String myString = " Kek";
        System.out.println(myString + " \u00A9 + 2022");
        int myInt = 50;
        myString = myString+myInt;
        System.out.println(myString);
        double myDouble = 250.24151224D;
        System.out.println(myString+myDouble);



    }
}
