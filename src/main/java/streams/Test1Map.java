package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Private");
        list.add("Poka");
        list.add("kak dela?");
        list.add("Ok");
        List<Integer> collectList = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());
//        System.out.println(collectList);

        int[] array = {1, 5, 7, 12, 25, 100};
        array = Arrays.stream(array).map(element -> {
            if (element % 5 == 0) {
                element = element / 5;
            }
            return element;
        }).toArray();
//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Private");
        set.add("Poka");
        set.add("kak dela?");
        set.add("Ok");
        System.out.println(set);
        Set<Integer> collectSet = set.stream().map(elementOfSet -> elementOfSet.length()).collect(Collectors.toSet());
        System.out.println(collectSet);
        List<Integer> collectListSet = set.stream().map(elementOfSet -> elementOfSet.length()).collect(Collectors.toList());
        System.out.println(collectListSet);


    }
}
