package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan GTR", "Red");
        Employee employee = new Employee("Andrey", "Ermolenko", "IT", 50000.00, car);
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("DONE!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
