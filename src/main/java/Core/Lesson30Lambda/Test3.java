package Core.Lesson30Lambda;

public class Test3 {
    static void def(Test5 t) {
        System.out.println(t.abc("privet","poka"));
    }

    public static void main(String[] args) {
        def((x,y) -> x.length());
    }
}

interface Test5 {
    int abc(String s1,String s2);
}
