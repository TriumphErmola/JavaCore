package collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(8);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        //Union-объединение уникальных элементов обоих множеств.addAll
        Set<Integer> unionSet = new HashSet<>(hashSet1);
        unionSet.addAll(hashSet2);
        System.out.println(unionSet);
        //Intersect-общие элементы обоих множеств.retainAll
        Set<Integer> intersectSet = new HashSet<>(hashSet1);
        intersectSet.retainAll(hashSet2);
        System.out.println(intersectSet);
        //subtract-удаляем элементы одного множества из другого.removeAll
        Set<Integer> subtractSet = new HashSet<>(hashSet1);
        subtractSet.removeAll(hashSet2);
        System.out.println(subtractSet);

    }
}
