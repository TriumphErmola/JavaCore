package Core.Lesson27Exception;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("dasdasdasd");
        File f = new File("text11");
        try {
            FileWriter fileWriter = new FileWriter(f);
            FileInputStream fileInputStream = new FileInputStream(f);
            fileWriter.write(String.valueOf(result));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
