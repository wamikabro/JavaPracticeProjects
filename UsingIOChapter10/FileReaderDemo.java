package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Disk-to-Screen utility demonstrating a FileReader.
public class FileReaderDemo {
    public static void main(String[] args) {
        String s;
        PrintWriter pw = new PrintWriter(System.out, true);

        // Create and use a FileReader wrapped in a BufferReader.
        try(BufferedReader br = new BufferedReader(new FileReader("demofile.txt"))){
            while((s = br.readLine()) != null){
                pw.println(s);
            }
        }catch (IOException exception){
            pw.println("I/O Error: " + exception);
        }
    }
}
