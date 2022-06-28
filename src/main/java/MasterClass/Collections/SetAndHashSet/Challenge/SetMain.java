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
        System.out.println("There are " + kvadrati.size() + " kvadrati and " + kubi.size() + " kubov. ");

        Set<Integer> unionFigur = new HashSet<>(kvadrati);
        unionFigur.addAll(kubi);
        System.out.println("Union contains " + unionFigur.size() + " elementov.");

        Set<Integer> peresechenie = new HashSet<>(kvadrati);
        peresechenie.retainAll(kubi);
        System.out.println("peresechenie po " + peresechenie.size() + " elementam");

        for (Integer i : peresechenie) {
            System.out.println(i + " kvadrat " + Math.sqrt(i) + " and kub " + Math.cbrt(i));
        }

        Set<String> slova = new HashSet<>();
        String prigovor = " one day in the year of the fox";
        String[] slovaArray = prigovor.split(" ");
        slova.addAll(Arrays.asList(slovaArray));

        for (String str : slova) {
            System.out.println(str);
        }

        Set<String> natural = new HashSet<>();
        Set<String> boje = new HashSet<>();
        String[] naturalArray = {"all", "nature", "is", "but", "art", "unknown", "to", "three"};
        natural.addAll(Arrays.asList(naturalArray));

        String[] bojeArray = {"to", "err", "is", "human", "ti", "fogive", "divine"};
        boje.addAll(Arrays.asList(bojeArray));

    }


}
