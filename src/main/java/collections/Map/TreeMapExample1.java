package collections.Map;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Andrey", "Ermolenko", 5);
        Student st2 = new Student("Ivan", "Ivanov", 2);
        Student st3 = new Student("Peter", "Petrov", 3);
        Student st4 = new Student("Aziz", "Ermolina", 5);
        Student st5 = new Student("brighten", "Gavora", 4);
        Student st6 = new Student("Adobe", "Vorobushek", 3);
        Student st7 = new Student("Mariya", "Ermolina", 5);
        Student st8 = new Student("Kseniya", "Geeva", 1);
        Student st9 = new Student("Toma", "Zueva", 3);
        treeMap.put(5.8, st1);
        treeMap.put(2.8, st9);
        treeMap.put(4.4, st2);
        treeMap.put(9.8, st7);
        treeMap.put(7.8, st3);
        treeMap.put(4.8, st8);
        treeMap.put(5.4, st4);
        treeMap.put(9.2, st6);
        treeMap.put(8.2, st5);

//        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        Student st1 = new Student("Andrey", "Ermolenko", 5);
//        Student st2 = new Student("Andrey", "Banov", 5);
//        Student st3 = new Student("Peter", "Petrov", 3);
//        Student st4 = new Student("Aziz", "Ermolina", 5);
//        Student st5 = new Student("brighten", "Gavora", 4);
//        Student st6 = new Student("Adobe", "Vorobushek", 3);
//        Student st7 = new Student("Mariya", "Ermolina", 5);
//        Student st8 = new Student("Kseniya", "Geeva", 1);
//        Student st9 = new Student("Toma", "Zueva", 3);
//        treeMap.put(st1, 5.8);
//        treeMap.put(st9, 2.8);
//        treeMap.put(st2, 4.4);
//        treeMap.put(st7, 9.8);
//        treeMap.put(st3, 7.8);
//        treeMap.put(st8, 4.8);
//        treeMap.put(st4, 5.4);
//        treeMap.put(st6, 9.2);
//        treeMap.put(st5, 8.2);
//
//        Student st10 = new Student("Toma", "Zueva", 3);
//        System.out.println(treeMap.containsKey(st10));

//        System.out.println(treeMap);
//        System.out.println(treeMap.get(2.8));
//        System.out.println(treeMap.remove(5.8));
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(4.5));
//        System.out.println(treeMap.headMap(4.5));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }
}
