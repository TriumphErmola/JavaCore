package work_with_files.programmer2;

import work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestemployee;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            bestemployee = (Employee) objectInputStream.readObject();
            System.out.println(bestemployee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
