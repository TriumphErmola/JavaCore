package Core.Lesson30Lambda;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student st1 = new Student("Andrey", 'M', 28, 5, 9.99);
        Student st2 = new Student("Egor", 'M', 24, 2, 7.0);
        Student st3 = new Student("Petr", 'M', 22, 3, 3.5);
        Student st4 = new Student("Irina", 'F', 26, 1, 7.25);
        Student st5 = new Student("Vika", 'F', 27, 4, 5.39);
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverAge(arrayList,25);
        System.out.println("===============================");
        studentInfo.printStudentsBySex(arrayList,'F');
        System.out.println("===============================");
        studentInfo.printStudentsOverGrade(arrayList,8.8);
        System.out.println("===============================");
        studentInfo.printStudentsMixConditions(arrayList,5.5,20,'M');
    }

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo {
    void printStudent(Student student) {
        System.out.println("Имя студента - " + student.name + " Пол студента - " +
                student.sex + " Возраст студента - " + student.age + " Курс студента - "
                + student.course + " Средняя оценка студента - " + student.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> studentArrayList, double avgGrade) {
        for (Student student : studentArrayList) {
            if (student.avgGrade > avgGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> studentArrayList, double avgGrade) {
        for (Student student : studentArrayList) {
            if (student.avgGrade < avgGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> studentArrayList, int age) {
        for (Student student : studentArrayList) {
            if (student.age > age) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> studentArrayList, int age) {
        for (Student student : studentArrayList) {
            if (student.age < age) {
                printStudent(student);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> studentArrayList, char sex) {
        for (Student student : studentArrayList) {
            if (student.sex == sex) {
                printStudent(student);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> studentArrayList, double avgGrade, int age, char sex) {
        for (Student student : studentArrayList) {
            if (student.avgGrade > avgGrade && student.age < age && student.sex == sex) {
                printStudent(student);
            }
        }
    }

}