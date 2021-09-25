package collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student st1 = new Student("Andrey", 5);
        Student st2 = new Student("Maxim", 2);
        Student st3 = new Student("Vadim", 4);
        Student st4 = new Student("Andrey", 2);
        Student st5 = new Student("Igor", 1);
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }

}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }
}



