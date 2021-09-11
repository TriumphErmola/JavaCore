package collections.ArraysList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Абаддон");
        arrayList1.add("Сигизмунд");
        arrayList1.add("Севатар");
        arrayList1.add("Ролдарон");
        arrayList1.add("Амит");
        arrayList1.add("Барабас");
        arrayList1.add("Ариман");
        arrayList1.add("Ариман");
        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Ариман"));
        System.out.println(arrayList1.lastIndexOf("Ариман"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.contains("Ариман"));





//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("$$$");
//        arrayList2.add("???");
//
//        arrayList1.addAll(2,arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
//        System.out.println(arrayList1);
    }

}
