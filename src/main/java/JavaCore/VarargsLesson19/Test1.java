package JavaCore.VarargsLesson19;

public class Test1 {
    static void summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(1, 2, 3, 4, 5, 6);
    }
}
