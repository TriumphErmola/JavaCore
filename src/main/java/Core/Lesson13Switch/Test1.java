package Core.Lesson13Switch;

public class Test1 {
    public static void main(String[] args) {
        Student st1 = new Student(1);
        switch (st1.grade) {
            case 2:
                System.out.println("student dvoechnik");
                break;
            case 3:
                System.out.println("student troechnik");
                break;
            case 4:
                System.out.println("student chorochist");
                break;
            case 5:
                System.out.println("student otlichnik");
                break;
            default:
                System.out.println("Choto poshlo ne tak");
        }

    }

}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }
}
