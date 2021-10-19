package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test11.txt");
//        Files.createFile(filePath);
//        String dialog = "Privet\nPrivet\nKak dela?\nNormalno\nKak u teby?\nToje horosho!";
//        Files.write(filePath,dialog.getBytes());
        List<String> stringList = Files.readAllLines(filePath);
        for(String s : stringList){
            System.out.println(s);
        }
    }
}
