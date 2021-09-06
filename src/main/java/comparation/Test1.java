package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> listloyalPrimarchs = new ArrayList<>();
        listloyalPrimarchs.add("Сангвиний");
        listloyalPrimarchs.add("Жиллиман");
        listloyalPrimarchs.add("Лев");
        listloyalPrimarchs.add("ФеррусМанус");
        listloyalPrimarchs.add("Коракс");
        listloyalPrimarchs.add("Вулкан");
        listloyalPrimarchs.add("Дорн");
        listloyalPrimarchs.add("ЯгатайХан");
        System.out.println("Перед сортировкой");
        System.out.println(listloyalPrimarchs);
        Collections.sort(listloyalPrimarchs);
        System.out.println("После сортировкой");
        System.out.println(listloyalPrimarchs);


    }
}
