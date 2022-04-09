package Core.Lesson25Necromorphs;

public class Test1 {
    public static void main(String[] args) {

        Teacher[] teachers = {new Teacher(), new Teacher()};
        Employee[] employees = {new Teacher(), new Doctor(), new Driver()};
        HelpAble[] helpAbles = {new Teacher(), new Doctor(), new Driver()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        HelpAble helpAble = new Teacher();
        helpAble.help();

        Employee[] employees1 = {emp1, emp2, emp3};

        for(Employee employee : employees1){
            employee.work();
        }
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee spit");
    }

    abstract void work();
}

class Teacher extends Employee implements HelpAble {
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher pomogaet");
    }
}

class Driver extends Employee implements HelpAble {
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver pomogaet");
    }
}

class Doctor extends Employee implements HelpAble {
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor pomogaet");
    }
}

interface HelpAble {
    void help();
}
