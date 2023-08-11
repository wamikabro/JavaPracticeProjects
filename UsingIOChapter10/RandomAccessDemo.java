package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.IOException;
import java.io.RandomAccessFile;

// Demonstrate random access files.
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        // Opening a Random Access File to use.
        try(RandomAccessFile raf = new RandomAccessFile("demofile.txt", "rw")){
            // Write values to the file
            for(int i = 0; i < data.length; i++)
                raf.writeDouble(data[i]);

            // Now read the data randomly.
            raf.seek(0); // seek to first double.
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8 * 3); // seek the forth double.
            d = raf.readDouble();
            System.out.println("Forth value is " + d);

            raf.seek(8); // seek the second double.
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            System.out.println();

            // Now, read more randomly
            System.out.println("Here are the some other values: ");
            for(int i=0; i< data.length; i+=2){
                raf.seek(8 * i); // seek the 'i'th double.
                d = raf.readDouble();
                System.out.println(d + " ");
            }
        }catch (IOException exception){
            System.out.println("I/O Error: " + exception);
        }
    }
}
