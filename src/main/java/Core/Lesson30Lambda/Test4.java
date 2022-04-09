package Core.Lesson30Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {


        ArrayList<Student1> arrayList = new ArrayList<>();
        Student1 stud1 = new Student1("Andrey", 'M', 28, 5, 9.99);
        Student1 stud2 = new Student1("Egor", 'M', 24, 2, 7.0);
        Student1 stud3 = new Student1("Petr", 'M', 22, 3, 3.5);
        Student1 stud4 = new Student1("Irina", 'F', 26, 1, 7.25);
        Student1 stud5 = new Student1("Vika", 'F', 27, 4, 5.39);
        arrayList.add(stud1);
        arrayList.add(stud2);
        arrayList.add(stud3);
        arrayList.add(stud4);
        arrayList.add(stud5);

        for(Student1 s : arrayList){
            System.out.println(s.name);
        }
        System.out.println("===========");
        arrayList.removeIf(x -> x.name.endsWith("a"));
        for(Student1 s : arrayList){
            System.out.println(s.name);
        }

    }


}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    void printStudent(Student1 student) {
        System.out.println("Имя студента - " + student.name + " Пол студента - " +
                student.sex + " Возраст студента - " + student.age + " Курс студента - "
                + student.course + " Средняя оценка студента - " + student.avgGrade);
    }

    void testStudents(ArrayList<Student1> student1ArrayList, Predicate<Student1> t) {
        for (Student1 student1 : student1ArrayList) {
            if (t.test(student1)) {
                printStudent(student1);
            }
        }
    }

}



