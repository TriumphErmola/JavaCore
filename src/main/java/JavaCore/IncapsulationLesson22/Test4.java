package JavaCore.IncapsulationLesson22;

public class Test4 {

}

class Human2 {
    String name;
    String surName;

    public Human2(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}

class Student2 extends Human2 {
    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                '}';
    }

    int course;

    public Student2(String name, String surname, int course) {
        super(name, surname);
        this.course = course;

    }

    public static void main(String[] args) {
        Student2 st2 = new Student2("Andrey", "Ermola", 5);
        System.out.println(st2);
    }

}
