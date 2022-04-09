package Core.Lesson20ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("poka");
        arrayList.add("privet");
        arrayList.add("ok");
        arrayList.add(1,"kakdela");
        for(String s : arrayList){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("********************");
        arrayList.set(3,"!!!!");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("pojeja");
        arrayList1.add("peremoga");
        arrayList1.add("zrada");
        arrayList1.add("polynica");

        arrayList.addAll(arrayList1);
        System.out.print(arrayList);





    }
}

