package javaBeginnersGuideProjects.GenericsChapter13.Queue;
// A generic queue interface.
public interface IGenQ<T> {
    // Put an item into the queue.
    void put(T ch) throws QueueFullException;

    // Get an item from the queue.
    T get() throws QueueEmptyException;
}
