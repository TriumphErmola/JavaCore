package nestedClasses.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(5, 3));
        System.out.println(m2.doOperation(7, 2));
    }
}

interface Math {
    int doOperation(int a, int b);
}
