package MasterClass.Lambda.FuncInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        printComradeByAge(comrades, "Comrade over 30", comrade ->
                comrade.getAgeOfComrade() >= 30);

        printComradeByAge(comrades, "\nComrade young 29", comrade -> comrade.getAgeOfComrade() < 29);

        printComradeByAge(comrades, "\n Comrade younger than 25", new Predicate<Comrade>() {
            @Override
            public boolean test(Comrade comrade) {
                return comrade.getAgeOfComrade() < 25;
            }
        });

        IntPredicate greterFor15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greterFor15.test(10));
        int a = 20;
        System.out.println(greterFor15.test(a + 5));
        System.out.println(greterFor15.and(lessThan100).test(50));

        Random random = new Random();
        Supplier<Integer> randomSuplier = () -> random.nextInt(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSuplier.get());
        }


    }

    private static void printComradeByAge(List<Comrade> comrades,
                                          String ageText,
                                          Predicate<Comrade> ageCondition) {
        System.out.println(ageText);
        System.out.println("------------------");
        for (Comrade comrade : comrades) {
            if (ageCondition.test(comrade)) {
                System.out.println(comrade.getNameOfComrade());
            }
        }

    }
}


