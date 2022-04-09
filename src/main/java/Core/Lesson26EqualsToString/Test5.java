package Core.Lesson26EqualsToString;

public class Test5 {
    {
        System.out.println("Это инит блок3");
    }

    Test5() {
        System.out.println("Это конструктор1");
    }

    Test5(int a) {
        this();
        System.out.println("Это конструктор2");
    }

    //    initializer block
    {
        System.out.println("Это инит блок1");
    }

    static {
        System.out.println("Это static инит блок1");
    }

    {
        System.out.println("Это инит блок2");
    }

    static {
        System.out.println("Это static инит блок2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t1 = new Test5(5);

    }
}
