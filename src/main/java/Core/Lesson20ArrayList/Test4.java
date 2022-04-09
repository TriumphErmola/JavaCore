package Core.Lesson20ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();


        System.out.println("list - "+ list);
        list.get(0).append("!!!");
        list.set(0,new StringBuilder("DAKKA"));

        System.out.println("list1 - "+ list1);
    }
}
