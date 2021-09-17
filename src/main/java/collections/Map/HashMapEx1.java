package collections.Map;


import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1488, "Andrey Ermolenko");
        map1.put(1325, "Varvara Ermolenko");
        map1.put(2288, "Anastasiya Ermolenko");
        map1.put(123456, "Nikolay Petrov");
        map1.putIfAbsent(123456, "Oleg Petrovs");
        String s = map1.get(1488);
        System.out.println(s);
        String b = map1.remove(2288);
        System.out.println(b);
        System.out.println(map1);
        System.out.println(map1.containsValue("Andrey Ermolenko"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
