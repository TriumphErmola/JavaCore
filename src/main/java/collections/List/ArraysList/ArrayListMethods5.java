package collections.List.ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Абаддон");
        arrayList1.add("Сигизмунд");
        arrayList1.add("Севатар");
        arrayList1.add("Ролдарон");
        arrayList1.add("Амит");
        arrayList1.add("Барабас");
        arrayList1.add("Ариман");
        arrayList1.add("Никона");
        arrayList1.add("Кхарн");
        arrayList1.add("Люций");
        arrayList1.add("Тарвиц");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

        Object[] arrayCM = arrayList1.toArray();
        String[] arrayString = arrayList1.toArray(new String[0]);
        for(Object ob : arrayCM) {
            System.out.println(ob);
        }
        for(String str : arrayString){
            System.out.println(str);
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Кхарн");
        arrayList2.add("Люций");
        arrayList2.add("Тарвиц");
        arrayList2.add("Барабас");
        arrayList2.add("Амит");
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

    }
}
