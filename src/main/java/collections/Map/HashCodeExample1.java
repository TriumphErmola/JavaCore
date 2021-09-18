package collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Andrey", "Ermolenko", 5);
        Student st2 = new Student("Maxim", "Ivanov", 2);
        Student st3 = new Student("Vadim", "Petrov", 3);
        map.put(st1, 7.5);
        map.put(st2, 6.8);
        map.put(st3, 5.3);
        System.out.println(map);
        Student st4 = new Student("Andrey", "Ermolenko", 5);
        Student st5 = new Student("Igor", "Sidorov", 4);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

final class Student implements Comparable<Student> {
    final private String name;
    final private String surname;
    final private int course;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course &&
//                Objects.equals(name, student.name) &&
//                Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    @Override
    public int compareTo(Student o) {
        int res = this.name.compareTo(o.name);
        if (res == 0) {
            res = this.surname.compareTo(o.surname);
        }
        return res;
    }
}
