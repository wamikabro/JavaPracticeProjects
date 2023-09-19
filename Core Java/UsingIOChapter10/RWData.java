package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.*;

// Write and then read back binary data.
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Write some values.
        try(var dataOut = new DataOutputStream(new FileOutputStream("demofile.txt"))){
            System.out.println("Writing " + i);
            dataOut.writeInt(i);

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }catch(IOException exception){
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        // Now, read them back.
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("demofile.txt"))){
            i = dataIn.readInt();
            System.out.println("Reading " + i);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);

            b = dataIn.readBoolean();
            System.out.println("Reading " + b);

            d = dataIn.readDouble();
            System.out.println("Reading " + 12.2 * 7.4);

        }catch(IOException exception){
            System.out.println("Read error.");
            return;
        }
    }
}
