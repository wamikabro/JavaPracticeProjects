package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.FileInputStream;
import java.io.IOException;

// Ths version of the ShowFile program using try-with-resources
public class ShowFileAutoClose {
    public static void main(String[] args) {
        int  i;
        // Following code is using try with resource
        // It will automatically close it when the try block is left.
        try(FileInputStream fin = new FileInputStream("C:\\Users\\INSPIRE COMP\\Downloads\\Files\\Projects\\JavaProjects2022\\javaBeginnersGuideProjects\\UsingIOChapter10\\demofile.txt")){
            do{
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);

        }catch(IOException exception) {
            System.out.println("I/P Error: " + exception);
        }
    }
}
