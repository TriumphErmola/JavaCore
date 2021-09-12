package collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Абаддон");
        arrayList1.add("Сигизмунд");
        arrayList1.add("Севатар");
        arrayList1.add("Ролдарон");
        arrayList1.add("Амит");
        arrayList1.add("Барабас");
        arrayList1.add("Ариман");


        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
