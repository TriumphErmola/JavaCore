package Core.Lesson27Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {

        try {
            fis1 = new FileInputStream("text10");
            System.out.println("file text10 существует и в системе найден");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("есть проблемы со стримом fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file text10 ne nayden");
        } catch (NullPointerException e) {
            System.out.println("srabotal NullPointerException");
        }
    }
}
