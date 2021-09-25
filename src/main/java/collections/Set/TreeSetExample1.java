package collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(2);
        treeSet.add(15);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.remove(12);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(15));
    }
}
