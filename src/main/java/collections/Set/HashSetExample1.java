package collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Andrey");
        set.add("Igor");
        set.add("Oleg");
        set.add("Oleg");
//        set.add(null);
        set.remove("Oleg");
        int size = set.size();
        System.out.println(size);
        boolean empty = set.isEmpty();
        System.out.println(empty);
        boolean andrey = set.contains("Andrey");
        System.out.println(andrey);
        for(String s : set){
            System.out.println(s);
        }


    }
}
