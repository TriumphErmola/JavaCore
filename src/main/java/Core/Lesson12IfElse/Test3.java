package Core.Lesson12IfElse;

public class Test3 {
    static void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        } else
            System.out.println("Maximum - " + i3);
    }

    static void abc() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "privet";
        }
        if (a < 10) {
            str = "poka";
            System.out.println(str);
        } else {
            str = null;
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
//        maximum(5, 4, 2);
//        abc();
        int a = 20;
        int b = 10;
        int max = (a > b) ? a : b;
        System.out.println(max);
    }


}
