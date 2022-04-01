package JavaCore.Lesson20ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list) {
            System.out.print(sb+ " ");
        }
        list.remove(2);
        System.out.println(list);



    }
}
