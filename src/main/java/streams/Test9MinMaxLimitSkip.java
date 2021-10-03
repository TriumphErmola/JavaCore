package streams;

import java.util.ArrayList;
import java.util.List;

public class Test9MinMaxLimitSkip {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 9.5);
        Student st2 = new Student("Nicolai", 'm', 26, 5, 7.5);
        Student st3 = new Student("Elena", 'f', 19, 2, 8.5);
        Student st4 = new Student("Petr", 'm', 32, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 21, 3, 8.9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
        System.out.println("-----------------------------------");
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("-----------------------------------");

        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
        System.out.println("-----------------------------------");

    }
}