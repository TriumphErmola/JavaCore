package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4Reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(4);
        integerList.add(15);
        integerList.add(3);
        integerList.add(6);
        integerList.add(9);

        int result = integerList.stream().reduce((accumulator, element) ->
                accumulator * element).get();
//        System.out.println(result);

        int result1 = integerList.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
//        System.out.println(result1);

        List<String> stringList = new ArrayList<>();
        stringList.add("Private");
        stringList.add("Poka");
        stringList.add("kak dela?");
        stringList.add("Ok");
        String result3 = stringList.stream().reduce((accumulator, element) ->
                accumulator + " " + element).get();
        System.out.println(result3);

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = integerList.stream().reduce((accumulator, element) ->
//                accumulator * element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }
    }
}
