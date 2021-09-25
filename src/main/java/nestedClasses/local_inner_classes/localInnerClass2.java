package nestedClasses.local_inner_classes;

public class localInnerClass2 {
    public static void main(String[] args) {
        class Slojenie implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slojenie slojenie=new Slojenie();
        int i = slojenie.doOperation(5, 3);
        System.out.println(i);
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
