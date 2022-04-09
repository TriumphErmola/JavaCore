package Core.Lesson11ArgumentsMethods;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichenie(double d){
        d=d*2;
        return d;
    }

    public double uvelichetel2() {
        salary = salary * 2;
        return salary;
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrey",450.55);
        double uvelichenie = employee1.uvelichenie(employee1.salary);
        System.out.println(uvelichenie);
        System.out.println(employee1.salary);
        employee1.uvelichetel2();
        System.out.println(employee1.salary);
    }
}
