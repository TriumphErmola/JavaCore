package lambda;

import java.util.*;
import java.util.function.Predicate;


public class StudentInfo {

    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
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

//        Collections.sort(students, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        System.out.println(students);
//        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);

        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("======");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });

//        info.testStudents(students, p -> p.avgGrade > 8);
//        info.printStudentsOverGrade(students, 8.0);
//        System.out.println("======");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("======");
//        info.printStudentsMixCondition(students, 20, 9.0, 'f');
    }

    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
        for (Student s : a1) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
        for (Student s : a1) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
        for (Student s : a1) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
