package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Copyfile that takes two Arguments in Try With Resource
public class CopyFileTwoArgumentResources {
    public static void main(String[] args) {
        int i;

        // Confirm arguments having the length of two.
        if(args.length !=2){
            System.out.println("You Haven't Set Arguments Properly.");
            return;
        }

        // Open and manage two files via the same try statement.
        try(var fin = new FileInputStream(args[0]);
            var fout = new FileOutputStream(args[1])){

            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        }catch(IOException exception){
            System.out.println("I/O Error: " + exception);
        }
    }
}
