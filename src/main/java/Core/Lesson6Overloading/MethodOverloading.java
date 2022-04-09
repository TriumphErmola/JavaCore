package Core.Lesson6Overloading;

public class MethodOverloading {
    void showInfo(int i1) {
        System.out.println(i1);
    }

    void showInfo(int i1, int i2) {
        System.out.println(i1);
    }

    void showInfo(boolean b1) {
        System.out.println(b1);
    }

    void showInfo(String str1,int b2) {
        System.out.println("kek2");
    }
    void showInfo(int b2,String str1) {
        System.out.println("str1");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 15;
        int b = 20;
        mO.showInfo(a);
        mO.showInfo(b, a);
        boolean b1 = true;
        boolean b2 = false;
        mO.showInfo(b2);
        String str = "kek";
        mO.showInfo(str,2);
        mO.showInfo(2,str);

    }
}


