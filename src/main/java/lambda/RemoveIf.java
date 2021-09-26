package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Private");
        al.add("Poka");
        al.add("Kak dela");
        al.add("Poehali");
        al.add("Ok");
        al.add("Java uchim");
        al.add("A imenno uchim lambda");
//        al.removeIf(element -> element.length()<5);
        Predicate<String> predicate = element -> element.length() < 5;
        al.removeIf(predicate);
        System.out.println(al);

    }
}
