package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;


public class StudentInfo {

    void testStudents(@org.jetbrains.annotations.NotNull ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 9.5);
        Student st2 = new Student("Nicolai", 'm', 26, 5, 7.5);
        Student st3 = new Student("Elena", 'f', 19, 2, 8.5);
        Student st4 = new Student("Petr", 'm', 32, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 21, 3, 8.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Predicate<Student> pr1 = student -> student.avgGrade > 7.5;
        Predicate<Student> pr2 = student -> student.sex == 'm';

        info.testStudents(students, pr1.and(pr2));
        System.out.println("=====");
        info.testStudents(students, pr1.or(pr2));
        System.out.println("=====");
        info.testStudents(students, pr1.negate());
        System.out.println("=====");

        Function<Student, Double> function = student -> student.avgGrade;
        double res = avgOfSomething(students, student -> student.avgGrade);
        double res1 = avgOfSomething(students, student -> (double) student.course);
        double res2 = avgOfSomething(students, student -> (double) student.age);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }

    private static double avgOfSomething(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student st : list) {
            result += function.apply(st);
        }
        result = result / list.size();
        return result;
    }


}
