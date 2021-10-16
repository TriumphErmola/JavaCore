package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WileReaderEx {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("file2.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("DONE!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
