package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<?> list = new ArrayList<String>();

        List<? extends Number> listTestwildcards = new ArrayList<Integer>();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(228.14);
        doubleList.add(14.88);
        doubleList.add(19.94);
        System.out.println(summ(doubleList));


        showListelements(doubleList);


    }

    static void showListelements(List<?> list) {
        System.out.println("Значение этого листа : " + list);
    }

    public static double summ(List<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        }
        return summ;
    }


}
