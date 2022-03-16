package JavaCore.Lesson24Interface;

public class Test5 {


}

interface I1 {

    static void qwe() {
        System.out.println("static method");
    }

    void abc();

    default void bcd() {
        System.out.println("BCD");
    }

    default void def() {
        System.out.println("DEF");
    }


}

interface I2 extends I1 {

    default void bcd() {
        System.out.println("!!!!");
    }
}

class Z implements I1 {


    @Override
    public void abc() {
        System.out.println("ABC");
    }

    public static void main(String[] args) {
        Z z1 = new Z();
        z1.abc();
        z1.bcd();
        z1.def();
        I1.qwe();
    }

}
