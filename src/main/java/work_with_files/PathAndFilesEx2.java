package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Andrey\\Desktop\\M");
        Path directoryPath1 = Paths.get("C:\\Users\\Andrey\\Desktop\\B");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("text131.txt"));
//        Files.copy(directoryPath1,directoryPath.resolve("B"));
//        Files.move(filePath,directoryPath1.resolve("test15.txt"));
        System.out.println("DONE");
    }
}
