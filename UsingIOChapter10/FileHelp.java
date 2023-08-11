package javaBeginnersGuideProjects.UsingIOChapter10;
// A help program that uses a disk file to store help information

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The help class opens a help file, searches for a topic, and then displays
 the information associated with that topic.
 Notice that it handles all I/O exceptions itself, avoiding the need for
 calling code to do so.*/
class Help{
    String helpFile; // name of the help file.
    Help(String fileName){
        helpFile = fileName;
    }

    // Display help on a topic.
    boolean helpOn(String what){
        int ch;
        String topic, info;

        // Open the help file.
        try(var bufferedReader = new BufferedReader(new FileReader(helpFile))){
            do {
                // read characters until a # is found
                ch = bufferedReader.read();

                // check if topics match
                if (ch == '#') {
                    topic = bufferedReader.readLine();
                    if (what.compareTo(topic) == 0) { // found topic
                        do {
                            info = bufferedReader.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        }catch (IOException exception){
            System.out.println("Error accessing help file.");
        }
        return false; // topic not found.
    }
    // Get a Help topic.
    String getSelection(){
        String topic = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Topic: ");
        try{
            topic = bufferedReader.readLine();
        }catch(IOException exception){
            System.out.println("Error reading console.");
        }
        return topic;
    }
}



// Demonstrate the file-based Help system.
public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("helpFile.txt");
        String topic;

        System.out.println("Try the help system.");
        System.out.println("Enter \"stop\" to end.");

        do{
            topic = help.getSelection();
            if(!help.helpOn(topic) && !topic.equals("stop"))
                System.out.println("Topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}
