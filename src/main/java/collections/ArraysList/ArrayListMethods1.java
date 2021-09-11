package collections.ArraysList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Абаддон");
        arrayList1.add("Сигизмунд");
        arrayList1.add("Севатар");
        arrayList1.add("Ролдарон");
        arrayList1.add("Амит");
        arrayList1.add("Барабас");
        arrayList1.add("Ариман");
        arrayList1.add(5, "Никона");

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }

        arrayList1.set(1, "Гарвель Локен");
        arrayList1.remove("Севатар");
        System.out.println(arrayList1);
    }
}

