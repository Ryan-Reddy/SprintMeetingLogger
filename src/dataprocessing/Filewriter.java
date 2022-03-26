package dataprocessing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void filewriter(String newline, String path) throws IOException {
        System.out.println("programming needed in Filewriter.filewriter");
        System.out.println(newline);

        System.out.println("=====================");
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

        System.out.println("Opening file....");
        bw.append(newline);
        bw.newLine();
        System.out.println("Writing to file....");
        bw.close();
        System.out.println("Done!");

    }
}

