package JavaCore.Lesson26EqualsToString;

public class Test4 {
    static void def(Long a){
        System.out.println("E");
    }
    static void def(Long ... a){
        System.out.println("F");
    }

    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(String... s) {
        System.out.println("B");
    }

    static void abc(Object s) {
        System.out.println("C");
    }

    static void abc(String s, String b) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test4.abc("Ok","123","bcd");
        Test4.def((long)50,(long)100);
    }
}
