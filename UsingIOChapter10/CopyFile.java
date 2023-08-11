package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.*;

// Copy a text file.
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Copy a file
        try{
            // Try to open the files
            fin = new FileInputStream("C:\\Users\\INSPIRE COMP\\Downloads\\Files\\Projects\\JavaProjects2022\\javaBeginnersGuideProjects\\UsingIOChapter10\\demofile.txt");
            fout = new FileOutputStream("C:\\Users\\INSPIRE COMP\\Downloads\\Files\\Projects\\JavaProjects2022\\javaBeginnersGuideProjects\\UsingIOChapter10\\changedFile.txt");
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        }catch(IOException exception){
            System.out.println("I/O Error: " + exception);
        } finally{
            try{
                if(fin !=null) fin.close();
            } catch(IOException exc){
                System.out.println("Error Closing Input File.");
            }
            try{
                if(fout != null) fout.close();
            }catch(IOException exc){
                System.out.println("Error Closing Output File.");
            }
        }
    }
}
