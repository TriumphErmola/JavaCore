package MasterClass.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

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
}
