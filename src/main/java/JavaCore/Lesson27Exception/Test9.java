package JavaCore.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
        void abc () throws FileNotFoundException {
            try {
                File f = new File("text11");
                FileInputStream fis = new FileInputStream(f);
            } catch (FileNotFoundException e) {
                System.out.println("exception poyman i nemnogo obrabotan");
                throw e;
            } finally {
                System.out.println("block finally");
            }
        }

        void method(){
            try {
                abc();
            } catch (FileNotFoundException e) {
                System.out.println("exception poyman i polnostyu obrabotan");
            }
        }

//    void def()  {
//        try {
//            int[] array = {1, 2, 3,};
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("exception poyman i nemnogo obrabotan");
//            throw e;
//        } finally {
//            System.out.println("block finally");
//        }
//    }

}
