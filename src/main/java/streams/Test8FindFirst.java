package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test8FindFirst {
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

        Student first = students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);
    }
}