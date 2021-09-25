package collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(9);
        System.out.println(linkedHashSet);
        boolean remove = linkedHashSet.remove(7);
        System.out.println(remove);
        boolean contains = linkedHashSet.contains(9);
        System.out.println(contains);
        System.out.println(linkedHashSet);
    }
}
