package Core.Lesson8FinalStatic;

public class Test1 {
    private int a;

    public Test1(int a) {
        this.a=10;
    }

    public Test1() {
        a = 15;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1(12);
        test1.a = test1.a*2;
        System.out.println(test1.a);
    }
}
