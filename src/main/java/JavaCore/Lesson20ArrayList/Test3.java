package JavaCore.Lesson20ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        String sb1 = new String("hello");
        String sb2 = new String("ok");
        String sb3 = new String("ok");
        String sb4 = new String("ok");
        String sb5 = new String("ok");
        String sb6 = new String("privet");
        arrayList.add(sb1);
        arrayList.add(sb2);
        arrayList.add(sb3);
        arrayList.add(sb4);
        arrayList.add(sb5);
        arrayList.add(sb6);
        for (String sb : arrayList) {
            System.out.print(sb + " ");
        }
        System.out.println(arrayList.lastIndexOf("ok"));
//        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println("arrayList = " + arrayList.toString());

        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        System.out.println("arrayList1 = " + arrayList1);


    }
}
