package MasterClass.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> lotoGame = Arrays.asList(
                "N53", "S17", "I24", "N77", "D50", "A53", "N11", "K97",
                "A12", "A33", "A51", "a65", "A11", "a99");

        List<String> aNumbers = new ArrayList<>();

        lotoGame.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------");

        Stream<String> stringStream1 = Stream.of("I22", "I26", "I29", "I71");
        Stream<String> stringStream2 = Stream.of("N12", "N26", "I27", "I26", "G17", "I29", "I71");
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        System.out.println("------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        System.out.println("------------------");

        Comrade andrey = new Comrade("Andrey Ermolenko", 28);
        Comrade misha = new Comrade("Misha Shahmanov", 23);
        Comrade timur = new Comrade("Timur Timurovich", 38);
        Comrade evgeniy = new Comrade("Evgeniy Ohrimenko", 42);
        Comrade vlad = new Comrade("Vlad Marmelad", 21);

        Department hr = new Department("Otdel kadrov");
        hr.addComrade(misha);
        hr.addComrade(timur);
        hr.addComrade(evgeniy);
        hr.addComrade(vlad);

        Department welder = new Department("Otdel prime welder");
        welder.addComrade(andrey);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(hr);
        departmentList.add(welder);

        departmentList.stream()
                .flatMap(department -> department.getComradesList().stream())
                .forEach(System.out::println);

        System.out.println("------------------");

//        List<String> sortedListANumber = lotoGame
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("A"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedListANumber = lotoGame
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s : sortedListANumber) {
            System.out.println(s);
        }

        System.out.println("------------------");

        Map<Integer, List<Comrade>> groupedByAge = departmentList.stream()
                .flatMap(department -> department.getComradesList().stream())
                .collect(Collectors.groupingBy(comrade -> comrade.getAgeOfComrade()));


        departmentList.stream()
                .flatMap(department -> department.getComradesList().stream())
                .reduce((e1, e2) -> e1.getAgeOfComrade() < e2.getAgeOfComrade() ? e1 : e2)
                .ifPresent(System.out::println);

        System.out.println("------------------");

        Stream.of("ABC", "BCD", "AUE", "BFG", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();


    }

}
