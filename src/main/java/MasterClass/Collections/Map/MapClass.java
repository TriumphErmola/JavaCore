package MasterClass.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String, String> langs = new HashMap<>();
        if (langs.containsKey("Java")) {
            System.out.println("Java already");
        } else {
            langs.put("Java", "Java added");
            System.out.println("Java added in Map");
        }
        langs.put("Java", "oop lang and most popular");
        langs.put("JavaScript", "func lang and less popular lang how Java");
        langs.put("Algol", "algorithmic lang");
        langs.put("Basic", "beginners all purposes symbolic");

        if (langs.containsKey("Java")) {
            System.out.println("Java already in this Map");
        } else {
            langs.put("Java", "second value and update for key Java");
        }

        System.out.println("====================");

        for (String keys : langs.keySet()) {
            System.out.println(keys + " : " + langs.get(keys));
        }
    }
}
