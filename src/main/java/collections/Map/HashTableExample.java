package collections.Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Andrey", "Ermolenko", 5);
        Student st2 = new Student("Maxim", "Ivanov", 2);
        Student st3 = new Student("Vadim", "Petrov", 3);
        Student st4 = new Student("Aziza", "Ermolinka", 5);
        hashtable.put(65.0, st4);
        hashtable.put(25.0, st1);
        hashtable.put(45.0, st3);
        hashtable.put(15.0, st2);
        System.out.println(hashtable);
    }


}
