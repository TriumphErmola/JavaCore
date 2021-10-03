package streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Test5SortedConcatDistinctCountPeek {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 3, 8, 9, 5, 2, 4, 9, 0, 13};
        int[] toArray = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(toArray));

        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).getAsInt();
//        System.out.println(result);

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
//        System.out.println("Это стрим 3 : ");
//        stream3.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 1, 2, 3, 4, 5);
//        stream5.distinct().forEach(System.out::println);

//        System.out.println(stream5.count());
//        System.out.println(stream5.distinct().count());

        System.out.println(stream5.distinct().peek(System.out::println).count());

    }
}
