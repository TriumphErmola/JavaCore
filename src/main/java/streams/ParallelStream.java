package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumresult = list.stream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("summa result = " + sumresult);

        double sumresultparallel = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("summa result parallel = " + sumresult);
    }
}
