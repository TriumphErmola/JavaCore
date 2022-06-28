package MasterClass.Collections.SetAndHashSet.Challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> kvadrati = new HashSet<>();
        Set<Integer> kubi = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            kvadrati.add(i * i);
            kubi.add(i * i * i);
        }
//        System.out.println("There are " + kvadrati.size() + " kvadrati and " + kubi.size() + " kubov. ");

        Set<Integer> unionFigur = new HashSet<>(kvadrati);
        unionFigur.addAll(kubi);
//        System.out.println("Union contains " + unionFigur.size() + " elementov.");

        Set<Integer> peresechenie = new HashSet<>(kvadrati);
        peresechenie.retainAll(kubi);
//        System.out.println("peresechenie po " + peresechenie.size() + " elementam");

        for (Integer i : peresechenie) {
//            System.out.println(i + " kvadrat " + Math.sqrt(i) + " and kub " + Math.cbrt(i));
        }

        Set<String> slova = new HashSet<>();
        String prigovor = " one day in the year of the fox";
        String[] slovaArray = prigovor.split(" ");
        slova.addAll(Arrays.asList(slovaArray));

        for (String str : slova) {
//            System.out.println(str);
        }

        Set<String> natural = new HashSet<>();
        Set<String> boje = new HashSet<>();
        String[] naturalArray = {"all", "nature", "is", "but", "art", "unknown", "to", "three"};
        natural.addAll(Arrays.asList(naturalArray));

        String[] bojeArray = {"to", "err", "is", "human", "ti", "fogive", "divine"};
        boje.addAll(Arrays.asList(bojeArray));

        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(natural);
        diff1.removeAll(boje);
        printSet(diff1);

        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<>(boje);
        diff2.removeAll(natural);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(natural);
        unionTest.addAll(boje);
        Set<String> interTest = new HashSet<>(natural);
        interTest.retainAll(boje);
        System.out.println("Symmetric diff");
        unionTest.removeAll(interTest);
        printSet(unionTest);

        if (natural.containsAll(boje)) {
            System.out.println("boje subset of natural");
        }
        if (natural.containsAll(interTest)) {
            System.out.println("intersection subset of natural");
        }
        if (boje.containsAll(interTest)) {
            System.out.println("intersection subset boje");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.println("\t");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


}
