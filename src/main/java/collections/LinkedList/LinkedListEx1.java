package collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Andrey", 5);
        Student st2 = new Student("Sergey", 4);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Danil", 3);
        Student st5 = new Student("Maxim", 1);

        List<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("Linkedlist = : " + studentLinkedList);
//        System.out.println(studentLinkedList.get(2));
        Student st6 = new Student("Zaur", 1);
        Student st7 = new Student("Victor", 4);
        studentLinkedList.add(st6);
        System.out.println("Linkedlist = : " + studentLinkedList);
        studentLinkedList.add(1, st7);
        System.out.println("Linkedlist = : " + studentLinkedList);
    }


}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}';
    }
}
