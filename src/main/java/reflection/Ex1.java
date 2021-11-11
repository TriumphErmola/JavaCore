package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee");
//        Class employeeClass1 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass2 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("=================");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("=================");

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("=================");

        Method someMethod1 = employeeClass.getMethod("incrementSalary");
        System.out.println("Return type of method incrementSalary = "
                + someMethod1.getReturnType() + ", parameter types = "
                + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("=================");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = "
                + someMethod2.getReturnType() + ", parameter types = "
                + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("=================");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name " + method.getName() + " return type =  " + method.getReturnType()
                    + "parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("=================");

    }
}
