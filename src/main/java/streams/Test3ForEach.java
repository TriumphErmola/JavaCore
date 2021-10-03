package streams;

import java.util.Arrays;

public class Test3ForEach {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 12, 25, 100};
//        Arrays.stream(array).forEach(elementArray
//                -> {
//            elementArray *= 2;
//            System.out.println(elementArray);
//        });
//        Arrays.stream(array).forEach(value -> S ystem.out.println(value));
//        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = : " + a);
    }
}
