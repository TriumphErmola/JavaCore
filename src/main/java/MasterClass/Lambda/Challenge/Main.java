package MasterClass.Lambda.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {

        List<String> topName2015 = Arrays.asList(
                "Amelia",
                "Aphelia",
                "Olivia",
                "emily",
                "Isla",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstNameofName2015 = new ArrayList<>();
        topName2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        long nameBeginingWithA = topName2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();


        System.out.println("Number name of beggining with A : " + nameBeginingWithA);

//        topName2015.forEach(name ->
//                firstNameofName2015.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
//        firstNameofName2015.sort((s1, s2) -> s1.compareTo(s2));
//        firstNameofName2015.forEach(s -> System.out.println(s));
//        firstNameofName2015.sort(String::compareTo);
//        firstNameofName2015.forEach(System.out::println);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] splitString = myString.split(" ");
                for (String str : splitString) {
                    System.out.println(str);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] splitString = myString.split(" ");
            for (String str : splitString) {
                System.out.println(str);
            }
        };

        Function<String, String> lambdaFunc = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
//        System.out.println(lambdaFunc.apply("1499"));

        String result = evereSecondCharacter(lambdaFunc, "15123125125123124");
//        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love Java";

        Supplier<String> iLoveJava1 = () -> {
            return "I love Java";
        };

        String result0 = iLoveJava.get();
//        System.out.println(result0);
        String result1 = iLoveJava1.get();
//        System.out.println(result1);

    }


    public static String evereSecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
