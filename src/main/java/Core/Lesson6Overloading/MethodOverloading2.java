package Core.Lesson6Overloading;

public class MethodOverloading2 {
    protected void showInfo(int i1) {
        System.out.println("int");
    }
//    public void showInfo(int i1,int i2){
//        System.out.println("int and int");
//    }

    public int showInfo(int i1, int i2) {
        return i1 + i2;
    }


    private String showInfo(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        MethodOverloading2 methodOverloading2 = new MethodOverloading2();
        methodOverloading2.showInfo(5);
        int i = methodOverloading2.showInfo(5, 2);
        System.out.println(i);
        String s = methodOverloading2.showInfo("kek", "us");
        System.out.println(s);
    }
}
