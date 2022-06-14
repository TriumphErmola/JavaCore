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

        langs.remove("Basic");
        if (langs.remove("Algol", "algorithmic lang")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Remove not use");
        }


        if (langs.replace("JavaScript", "func lang and less popular lang how Java", "1234")) {
            System.out.println("JS replaced");
        } else {
            System.out.println("JS not replaced");
        }
        System.out.println(langs.replace("Scala", "55555"));

        for (String keys : langs.keySet()) {
            System.out.println(keys + " : " + langs.get(keys));
        }
    }
}
