package Core.Lesson22Incapsulation;

public class Employee {
    private String name;
    private String surName;
    private int age;
    private static int salary;


    public void work() {
        System.out.println("Rabotaet");
    }

    public void rest() {
        System.out.println("otdihaet");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Employee.salary = salary;
    }
}

class Employ extends Employee {


    public static void main(String[] args) {
        Employ emp1 = new Employ();
        System.out.println(Employ.getSalary());
        emp1.rest();
        emp1.work();

    }


}
