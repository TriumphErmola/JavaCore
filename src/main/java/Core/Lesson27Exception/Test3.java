package Core.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

    void abc() throws FileNotFoundException {
        File f = new File("text10");
        FileInputStream fileInputStream = new FileInputStream(f);
    }

    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        try {
            test3.def();
        }catch (IOException e){
            System.out.println("exception poyman");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

    }
}

