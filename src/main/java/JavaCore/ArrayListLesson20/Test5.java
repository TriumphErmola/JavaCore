package JavaCore.ArrayListLesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        Object[] array1 = list.toArray();
        for (Object obj : array1) {
            System.out.println(obj);
        }

        StringBuilder[] array2 = list.toArray((new StringBuilder[0]));
        System.out.println(array2);

    }
}
