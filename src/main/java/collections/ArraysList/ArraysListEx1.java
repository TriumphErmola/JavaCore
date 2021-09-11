package collections.ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Абаддон");
        arrayList1.add("Сигизмунд");
        arrayList1.add("Севатар");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Ролдарон");
        arrayList2.add("Амит");

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Барабас");
        arrayList3.add("Ариман");

        List<String> arraysList4 = new ArrayList<>(arrayList1);
        System.out.println(arraysList4);
    }
}
