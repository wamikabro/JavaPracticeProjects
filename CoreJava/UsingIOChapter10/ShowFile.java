package javaBeginnersGuideProjects.UsingIOChapter10;
/*
    To use this program, specify the name of the
    file that you want to see.
    For example, to see a file called TEST.TXT, pass the following in constructor.
    java ShowFile TEST.TXT
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        try{
            fin = new FileInputStream("C:\\Users\\INSPIRE COMP\\Downloads\\Files\\Projects\\JavaProjects2022\\javaBeginnersGuideProjects\\UsingIOChapter10\\demofile.txt"); // passed the name of the file to be opened
        } // we could've caught IOException directly too, since FileNotFound is its subclass
        catch (FileNotFoundException exception) {
            System.out.println("File Not Found");
            return;
        }


        try{
            // read bytes until End of the File is reached
            do{
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        }catch (IOException exception){
            System.out.println("Error reading file.");
        }finally{
            // Close the file on the way out of the try block.
            try{
                fin.close();
            } catch(IOException exception){
                System.out.println("Error closing file.");
            }
        }
/*
        //Or we could've closed the file this way
        finally{
            // Close the file on the way out of the try block.
            try{
                if(fin != null) fin.close();
            }catch(IOException exception){
                System.out.println("Error Closing File.");
            }
        }*/

    }
}
