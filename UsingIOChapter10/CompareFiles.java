package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.FileInputStream;
import java.io.IOException;

/*
* Compare Two Files.
* To use this program, specify the names of the files to be compared on the command line */
public class CompareFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        // First make sure that both files have been specified.
        if(args.length !=2){
            System.out.println("Add arguments.");
            return;
        }

        // Compare the files.
        try(var file1 = new FileInputStream(args[0]);
            var file2 = new FileInputStream(args[1])){

            // Compare the contents of both files.
            do{
                i = file1.read();
                j = file2.read();
                if(i != j) break;
            } while(i != -1 && j != -1);

            if( i != j)
                System.out.println("Files are different.");
            else
                System.out.println("Files are same.");

        }catch (IOException exception){
            System.out.println("I/O Error: " + exception);
        }

    }
}
