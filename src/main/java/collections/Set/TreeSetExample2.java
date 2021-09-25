package collections.Set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> studentSet = new TreeSet<>();
        Student st1 = new Student("Andrey", 5);
        Student st2 = new Student("Maxim", 2);
        Student st3 = new Student("Vadim", 4);
        Student st4 = new Student("Andrey", 2);
        Student st5 = new Student("Igor", 1);
        Student st6 = new Student("Olga", 2);
        Student st7 = new Student("Olga", 4);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        studentSet.add(st6);
        studentSet.add(st7);
//        System.out.println(studentSet);
//        System.out.println(studentSet.first());
//        System.out.println(studentSet.last());
//        System.out.println(studentSet.headSet(st6));
//        System.out.println(studentSet.tailSet(st6));
//        System.out.println(studentSet.subSet(st6, st7));
        System.out.println(st7.equals(st3));
        System.out.println(st7.hashCode() == st3.hashCode());
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
    public int compareTo(Student anotherStudent) {
        return this.course - anotherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
