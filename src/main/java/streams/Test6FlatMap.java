package streams;

import java.util.ArrayList;
import java.util.List;

public class Test6FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 9.5);
        Student st2 = new Student("Nicolai", 'm', 26, 5, 7.5);
        Student st3 = new Student("Elena", 'f', 19, 2, 8.5);
        Student st4 = new Student("Petr", 'm', 32, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 21, 3, 8.9);
        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematic");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);


        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudentOfFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));


    }
}

class Faculty {
    String name;
    List<Student> studentOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOfFaculty() {
        return studentOfFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentOfFaculty.add(st);
    }
}
