package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(15);
        arrayList1.add(20);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("AVE");
        arrayList2.add("XRAM");
        arrayList2.add("ERMOLA");
        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);
    }

}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }

}
