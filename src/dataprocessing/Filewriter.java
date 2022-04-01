package dataprocessing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Filewriter {
    public static void filewriter(String newline, String path) throws IOException {
        System.out.println("programming needed in Filewriter.filewriter");
        System.out.println(newline);

        System.out.println("=====================");
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:\\Users\\RyRy\\IdeaProjects\\v1a-groep-4-the-avengers\\files\\AvengersMeetingLog_backup.txt", true));

//        BufferedWriter bw3 = new BufferedWriter(new FileWriter(Path.of("C:\\Users\\RyRy\\IdeaProjects\\v1a-groep-4-the-avengers\\files\\AvengersMeetingLog_backup.txt"), true));

        System.out.println("Opening file....");
        bw.append(newline);

        bw2.append(newline);
        bw3.append(newline);
        bw.newLine();
        bw2.newLine();
        bw3.newLine();
        System.out.println("Writing to file....");
        bw.close();
        bw2.close();
        bw3.close();


        System.out.println("Done!");

    }
}

