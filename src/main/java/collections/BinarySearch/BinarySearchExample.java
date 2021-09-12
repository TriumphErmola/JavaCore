package collections.BinarySearch;

import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args) {

//        Employee emp1 = new Employee(1, "Andrey", 90000);
//        Employee emp2 = new Employee(12, "Victor", 45000);
//        Employee emp3 = new Employee(52, "Masha", 15000);
//        Employee emp4 = new Employee(100, "Vika", 75000);
//        Employee emp5 = new Employee(67, "Egor", 45000);
//        Employee emp6 = new Employee(100, "Roma", 50000);
//        Employee emp7 = new Employee(74, "Georg", 14000);
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
//        employees.add(emp4);
//        employees.add(emp5);
//        employees.add(emp6);
//        employees.add(emp7);
//        Collections.sort(employees);
//        System.out.println(employees);

//        int index2 = Collections.binarySearch(employees, new Employee(67, "Egor", 45000));
//        System.out.println(index2);

//        int[] arrays = {1, 52, -52, 421, -666, 1488, 2, 6, 54, 78, 130};
//        System.out.println(Arrays.toString(arrays));
//        Arrays.sort(arrays);
//        System.out.println(Arrays.toString(arrays));
//        int index3 = Arrays.binarySearch(arrays, 130);
//        System.out.println(index3);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(-3);
        integerList.add(1);
        integerList.add(12);
        integerList.add(25);
        integerList.add(-14);
        integerList.add(150);
        integerList.add(9);
        integerList.add(42);
        integerList.add(2);
        integerList.add(-90);
        integerList.add(0);
        integerList.add(18);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.reverse(integerList);
        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
//        int index1 = Collections.binarySearch(integerList, 42);
//        System.out.println(index1);

    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}' + '\n');
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}