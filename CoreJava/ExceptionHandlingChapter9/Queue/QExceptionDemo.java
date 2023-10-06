package javaBeginnersGuideProjects.ExceptionHandlingChapter9.Queue;

import javaBeginnersGuideProjects.GenericsChapter13.Queue.QueueEmptyException;

import java.util.Queue;

public class QExceptionDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try{
            // overrun the queue
            for(i=0; i < 11; i++){
                System.out.println("Attemting to store: " +
                        (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try{
            // over empty the queue
            for(i=0; i<11; i++){
                System.out.println("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exception){
            System.out.println(exception);
        }
    }


}
