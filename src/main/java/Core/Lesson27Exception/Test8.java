package Core.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(abc());
    }


    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("text12");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("exception poyman");
            System.out.println("peremennaya a v catch blocke : " + a);
            return a;
        } finally {
            a.append("!!!!");
            System.out.println("block finally");
            System.out.println("peremennaya a v finally blocke : " + a);
        }
        return a;
    }
}
