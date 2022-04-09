package Core.Lesson26EqualsToString;

//public class Test6 {
//
//    static final int b;
//    int a = 10;
//
//    static {
//        b = 10;
//        int a = 15;
//    }
//}
//
//class B {
//    static int c;
//    static final int d;
//    static final int e = 1;
//    static final int f;
//
//    static {
//        c = 5;
//        d = 3;
//        f = 0;
//        c = 12;
//    }
//}
//
//class C {
//    String c = "ok";
//
//    {
//        System.out.println(c);
//    }
//
//    static int i = 0;
//
//    static {
//        System.out.println(i);
//    }
//
//    {
//        i = i + 1;
//        System.out.println(i);
//    }
//
//    C() {
//        System.out.println("это констуктор");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("привет всем");
//        C c = new C();
//    }
//}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);
    }
    static{
        abc(4);
    }
    {
        abc(6);
    }
    static{
        new D();
    }
    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}
