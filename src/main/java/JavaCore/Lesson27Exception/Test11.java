package JavaCore.Lesson27Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {



    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("text11");
            try {
                fis2 = new FileInputStream("text10");
            } catch (FileNotFoundException e) {
                System.out.println("file text10 ne nayden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file text9 ne nayden");
        } finally {
            System.out.println("eto vneshniy finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("найдено исключение в finally block");
            }
        }
    }
    public static void main(String[] args) {
        Test11 test11 = new Test11();
        test11.abc();
    }

}
