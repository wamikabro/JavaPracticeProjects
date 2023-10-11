package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Queue;

import javaBeginnersGuideProjects.ExceptionHandlingChapter9.Queue.QueueEmptyException;
import javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.DoublyLinkedList.DoublyLinkedList;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    DoublyLinkedList<T> list = new DoublyLinkedList<>();

    public Queue(){

    }

    public Queue(T firstElem){
        list.add(firstElem);
    }

    // return the size of the queue
    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    // peek the element at the front of the queue
    // empty will throw and error of Empty Queue
    public T peek(){
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        return list.peekFirst();
    }

    // to remove the element from the top: Dequeue.
    public T poll(){
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        return list.removeFirst();
    }

    // to add an element to the back: Enqueue
    public void offer(T elem){
        list.addLast(elem);
    }

    // return iterator for users who want to iterate.
    @Override public Iterator<T> iterator(){
        return list.iterator();
    }
}
