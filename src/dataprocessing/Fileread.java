package dataprocessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Fileread {
    public static List fileReader() throws IOException {
        System.out.println("init tableviewerController");
        Path path = Path.of("db/AvengersMeetingLog.txt");
        return Files.readAllLines(path);
    }
}