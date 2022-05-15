package MasterClass.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Novosibirsk");
        placesToVisit.add("Tobols   ");
        placesToVisit.add("Moskow");
        placesToVisit.add("Orsk");
        placesToVisit.add("Tyumen");
        placesToVisit.add("Krasnodar");

        printList(placesToVisit);

        placesToVisit.add(1, "Street of Freedom");
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("=======");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {//равны не добавляем
                System.out.println(newCity + " is already included as s destination");
                return false;
            } else if (comparison > 0) {//новый пунтк поэтому добавляем
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        listIterator.add(newCity);
    }
}
