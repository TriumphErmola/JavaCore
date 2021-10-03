package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test10MapToInt {
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

        List<Integer> courses = students.stream()
                .mapToInt(e1 -> e1.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream().mapToInt(e1 -> e1.getCourse()).sum();
        System.out.println(sum);

        Double average = students.stream().mapToInt(e1 -> e1.getCourse())
                .average()
                .getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(e1 -> e1.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(e1 -> e1.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}