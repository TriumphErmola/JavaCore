package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {

        Class EmployeeClass = Class.forName("reflection.Employee");

        Constructor<Employee> constructor1 = EmployeeClass.getConstructor();
        Object obj1 = constructor1.newInstance();

        Constructor constructor2 = EmployeeClass.getConstructor(int.class,
                String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Andrey", "IT-DEPARTMENT");
        System.out.println(obj2);

        Method method = EmployeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);
    }
}
