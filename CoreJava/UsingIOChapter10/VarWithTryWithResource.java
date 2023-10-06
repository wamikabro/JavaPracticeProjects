package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.FileInputStream;
import java.io.IOException;

// Elaborating the program that takes Arguments to show file.
public class VarWithTryWithResource {
    public static void main(String[] args) {
        int i;

        try(var fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if( i != -1) System.out.print((char) i);
            }while(i != -1);

        }catch(IOException exception){
            System.out.println("Exception Occured: " + exception);
        }
    }
}
