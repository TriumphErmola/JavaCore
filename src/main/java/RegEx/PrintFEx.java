package RegEx;

public class PrintFEx {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n"
                , emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Andrey", "Ermolenko", 50000, 0.20);
        Employee employee2 = new Employee(12, "Egor", "Boger", 15000, 0.15);
        Employee employee3 = new Employee(123, "Max", "kekerumi", 4000, 0.10);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);


    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
