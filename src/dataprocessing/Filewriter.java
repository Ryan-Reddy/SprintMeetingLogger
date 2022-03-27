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
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("db/AvengersMeetingLog_backup.txt", true));

        System.out.println("Opening file....");
        bw.append(newline);
        bw.newLine();
        bw2.append(newline);
        bw2.newLine();
        System.out.println("Writing to file....");
        bw.close();
        System.out.println("Done!");

    }
}

