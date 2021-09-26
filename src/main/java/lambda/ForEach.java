package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Private", "kak dela?", "Normalno", "Poka");
        for(String s:list){
//            System.out.println(s);
        }

//        list.forEach(str-> System.out.println(str));

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.forEach(e1->{
            System.out.println(e1);
            e1*=2;
            System.out.println(e1);
        });
    }
}
