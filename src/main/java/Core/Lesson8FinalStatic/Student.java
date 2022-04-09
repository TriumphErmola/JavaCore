package Core.Lesson8FinalStatic;

public class Student {
    String name;
    int course;
    static int countStudent;
    int a;

    public Student(String name1, int course1) {
        countStudent++;
        this.name = name1;
        this.course = course1;
        System.out.println("Student #:" + countStudent + " created");
    }

    static void showCount() {
        System.out.println("всего создано студентов - " + countStudent);
    }

    public void showInfo() {
        System.out.println("welcom student class");
    }

    void abc() {
        a++;
        countStudent++;
    }

    static void abcd() {
//        a++;
        countStudent++;
    }


    public static void main(String[] args) {

    }
}

