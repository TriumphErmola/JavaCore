package collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Andrey", "Ermolenko", 5);
        Student st2 = new Student("Ivan", "Ivanov", 2);
        Student st3 = new Student("Peter", "Petrov", 3);
        Student st4 = new Student("Aziz", "Ermolina", 5);
        linkedHashMap.put(65.0, st4);
        linkedHashMap.put(25.0, st1);
        linkedHashMap.put(45.0, st3);
        linkedHashMap.put(15.0, st2);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(25.0));
        System.out.println(linkedHashMap.get(65.0));
        System.out.println(linkedHashMap);
    }
}
