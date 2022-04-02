package JavaCore.Lesson12IfElse;

import JavaCore.Lesson11.Student;

public class Test4 {

    public static void main(String[] args) {
        Student st1 = new Student("Andrey", 5, 9.5);
        Student st2 = new Student("Andrey", 4, 9.5);
        Student st3 = new Student("Petr", 2, 6.5);
        Student st4 = new Student("Petr", 3, 6.5);
        Student st5 = new Student("Victor", 2, 6.5);
//        method1(st1, st2);
//        method1(st2, st3);
//        method1(st3, st4);
//        method2(st1, st2);
//        method2(st2, st3);
        method2(st3, st4);

    }


    public static void method1(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void method2(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            if (student1.course == student2.course) {
                if (student1.grade == student2.grade) {
                    System.out.println("Всё одинаковое");
                } else {
                    System.out.println("всё одинаковое кроме оценок");
                }
            } else {
                System.out.println("одинакое имена кроме курсов");
            }
        } else {
            System.out.println("ничего нет одинакового");
        }
    }


}
