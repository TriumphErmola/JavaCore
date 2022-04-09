package Core.Lesson26EqualsToString;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }

    void def(Object o) {
        System.out.println("Object");
    }

    void def(String o) {
        System.out.println("String");
    }

    void ghi(int a, int b) {
        System.out.println("hello1");
    }

    void ghi(long a, long b) {
        System.out.println("hello2");
    }

    void ghi(Integer a, Integer b) {
        System.out.println("hello3");
    }

    void ghi(int... a) {
        System.out.println("hello1");
    }


    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc((byte) 5);
        t.def("Hello");
        t.def(new StringBuilder("OK"));
        t.ghi(1,2);

    }
}
