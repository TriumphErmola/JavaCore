package JavaCore.Lesson25Necromorphs;

public class Test4 {
    public static void main(String[] args) {

        String[] array1 = {"privet", "poka"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
        //пропустит но будет ошибка, так как массив стрингов
        array2[0] = new StringBuilder("ok");
    }
}
