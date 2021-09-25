package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Andrey");
        queue.add("Igor");
        queue.add("Mariya");
        queue.add("Oleg");
        System.out.println(queue);
        queue.remove("Igor");
        System.out.println(queue);

//        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());



    }
}
