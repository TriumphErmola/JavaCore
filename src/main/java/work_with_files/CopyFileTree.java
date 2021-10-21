package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path sourse = Paths.get("C:\\Users\\Andrey\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\Andrey\\Desktop\\CopyHere");
        Files.walkFileTree(sourse, new MyFileVisitor2(sourse, destination));
        System.out.println("DONE!");

    }
}


class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path sourse;
    Path destination;

    public MyFileVisitor2(Path sourse, Path destination) {
        this.sourse = sourse;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(sourse.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(sourse.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

}
