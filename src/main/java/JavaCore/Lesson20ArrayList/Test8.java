package JavaCore.Lesson20ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {


    public ArrayList<String> abc(String... s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s1 : s) {
            if (!arrayList.contains(s1)) {
                arrayList.add(s1);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.abc("privet","poka","kak dela","chorocho","poehali");
    }

}
