package JavaCore.Lesson27Exception;

public class Test12 {
    void abc() {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e2) {
                System.out.println("Пойман NullPointerException");
            }
        }
    }

    public static void main(String[] args) {
        Test12 test12 = new Test12();
        test12.abc();
    }

}
