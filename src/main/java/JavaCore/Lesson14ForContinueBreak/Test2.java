package JavaCore.Lesson14ForContinueBreak;

public class Test2 {
    int i = 0;

    public static void main(String[] args) {
        method1(5);
    }

    static void method1(int i) {
        for (int j = 1; j < 11; j++) {
            i++;
            System.out.println(i + " " + j);

        }
    }
}
