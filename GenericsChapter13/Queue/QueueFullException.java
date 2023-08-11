package javaBeginnersGuideProjects.GenericsChapter13.Queue;
// An exception for queue-full errors.
public class QueueFullException extends Exception{
    int size;

    QueueFullException(int size){
        this.size = size;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}
