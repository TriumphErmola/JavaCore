package JavaCore.Lesson27Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test16 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = "privet";
        System.out.println(s1.equals(s2));

    }


}

class Animal2 {
    public Animal2() throws FileNotFoundException, IndexOutOfBoundsException {

    }

}

class Mouse2 extends Animal2 {

    public Mouse2() throws FileNotFoundException, Exception, IOException {
        super();
    }
}
