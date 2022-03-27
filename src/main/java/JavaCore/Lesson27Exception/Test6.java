package JavaCore.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("text11");
            FileInputStream fileInputStream = new FileInputStream(f);
        } catch (Exception e) {
            System.out.println("Exception poyman2");

        }
    }
}