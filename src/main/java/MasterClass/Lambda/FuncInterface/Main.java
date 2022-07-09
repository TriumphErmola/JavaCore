package MasterClass.Lambda.FuncInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {

        Comrade andrey = new Comrade("Andrey Ermolenko", 28);
        Comrade ivan = new Comrade("Ivan Ivanov", 32);
        Comrade tony = new Comrade("Tony Montano", 45);
        Comrade jim = new Comrade("Jim Raynor", 36);
        Comrade john = new Comrade("John Doe", 30);
        Comrade tim = new Comrade("Tim Buchalka", 21);
        Comrade jack = new Comrade("Jack Hill", 40);
        Comrade snow = new Comrade("Snow White", 22);
        Comrade red = new Comrade("Red RidingHood", 35);
        Comrade charming = new Comrade("Prince Charming", 31);

        List<Comrade> comrades = new ArrayList<>();
        comrades.add(andrey);
        comrades.add(ivan);
        comrades.add(tony);
        comrades.add(john);
        comrades.add(snow);
        comrades.add(jack);
        comrades.add(red);
        comrades.add(tim);
        comrades.add(charming);

        Function<Comrade, String> foundLastName = (Comrade comrade) -> {
            return comrade.getNameOfComrade().substring(comrade.getNameOfComrade().indexOf(' ') + 1);
        };

        String lastName = foundLastName.apply(comrades.get(2));
//        System.out.println(lastName);

        Function<Comrade, String> foundFirstName = (Comrade comrade) -> {
            return comrade.getNameOfComrade().substring(0, comrade.getNameOfComrade().indexOf(' '));
        };
        String firstName = foundFirstName.apply(comrades.get(0));
//        System.out.println(firstName);

        Random random1 = new Random();
        for (Comrade comrade : comrades) {
            if (random1.nextBoolean()) {
//                System.out.println(getAName(foundFirstName, comrade));
            } else {
//                System.out.println(getAName(foundLastName, comrade));
            }
        }

        Function<Comrade, String> upper = comrade -> comrade.getNameOfComrade().toUpperCase();
        Function<String, String> first = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upper.andThen(first);
//        System.out.println(chainedFunction.apply(comrades.get(0)));

        BiFunction<String, Comrade, String> concatAge = (String name, Comrade comrade) -> {
            return name.concat(" ") + comrade.getAgeOfComrade();
        };

        for (int i = 0; i < comrades.size(); i++) {
            String upperName = upper.apply(comrades.get(i));
            System.out.println(concatAge.apply(upperName, comrades.get(i)));
        }

        IntUnaryOperator incBy5 = i-> i+5;
        System.out.println(incBy5.applyAsInt(10));




    }

    private static String getAName(Function<Comrade, String> getName, Comrade comrade) {
        return getName.apply(comrade);
    }

//        printComradeByAge(comrades, "Comrade over 30", comrade ->
//                comrade.getAgeOfComrade() >= 30);
//
//        printComradeByAge(comrades, "\nComrade young 29", comrade -> comrade.getAgeOfComrade() < 29);
//
//        printComradeByAge(comrades, "\n Comrade younger than 25", new Predicate<Comrade>() {
//            @Override
//            public boolean test(Comrade comrade) {
//                return comrade.getAgeOfComrade() < 25;
//            }
//        });
//
//        IntPredicate greterFor15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//        System.out.println(greterFor15.test(10));
//        int a = 20;
//        System.out.println(greterFor15.test(a + 5));
//        System.out.println(greterFor15.and(lessThan100).test(50));
//
//        Random random = new Random();
//        Supplier<Integer> randomSuplier = () -> random.nextInt(100);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(randomSuplier.get());
//        }
//
//        comrades.forEach(comrade -> {
//            String lastName = comrade.getNameOfComrade().substring(comrade.getNameOfComrade().indexOf(' ')+1);
//            System.out.println("Last name : " + lastName);
//        });
//
//
//    }
//
//    private static void printComradeByAge(List<Comrade> comrades,
//                                          String ageText,
//                                          Predicate<Comrade> ageCondition) {
//        System.out.println(ageText);
//        System.out.println("------------------");
//        for (Comrade comrade : comrades) {
//            if (ageCondition.test(comrade)) {
//                System.out.println(comrade.getNameOfComrade());
//            }
//        }
//
//    }
}


