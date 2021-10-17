package work_with_files.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        employees.add("Andrey");
        employees.add("Egor");
        employees.add("Kristina");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))
        ) {
            outputStream.writeObject(employees);
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
