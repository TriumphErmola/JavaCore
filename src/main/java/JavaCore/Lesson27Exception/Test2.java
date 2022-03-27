package JavaCore.Lesson27Exception;

public class Test2 {
    public static void main(String[] args) {
        int [] array = new int[0];
        try {
            array = new int[]{1,2,3,4,5};
            System.out.println(array[6]);
            System.out.println("Privet VSEM!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Был пойман эксепшен " + e);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Данный код не имеет значения к эксепшенам");

    }
}
