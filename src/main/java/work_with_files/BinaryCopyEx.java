package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(
                "C:\\Users\\Andrey\\Downloads\\YouTube\\Картинки\\porsche-panamera-gts-foto-1.jpeg");
             FileOutputStream fileOutputStream = new FileOutputStream("porsche-panamera.jpeg");
        ) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            System.out.println("DONE");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
