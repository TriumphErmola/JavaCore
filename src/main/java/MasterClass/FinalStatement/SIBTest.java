package MasterClass.FinalStatement;

public class SIBTest {
    public static final String owner;

    static {
        owner = "andrey";
        System.out.println("SIBTest static init block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd static init block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
