package MasterClass.FinalStatement;

public class Main{

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
        System.out.println("**********************************");

        int pw = 1525;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(41341);
        password.letMeIn(5121);
        password.letMeIn(-1512412);
        password.letMeIn(1525);

    }
}
