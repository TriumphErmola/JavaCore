package collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer>deque=new ArrayDeque<>();
        deque.addFirst(5);
        deque.offerLast(155);
        deque.addFirst(7);
        deque.addLast(9);
        deque.offerFirst(11);
        deque.offerLast(15);
        deque.addFirst(4);
        deque.addFirst(3);
        deque.offerFirst(99);
        deque.addLast(108);
        deque.offerLast(156);
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
