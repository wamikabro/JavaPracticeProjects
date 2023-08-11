package javaBeginnersGuideProjects.ExceptionHandlingChapter9.Queue;

import javaBeginnersGuideProjects.GenericsChapter13.Queue.QueueEmptyException;

public interface ICharQ {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
}
