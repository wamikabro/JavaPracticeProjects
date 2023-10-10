package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Stack;

import javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.DoublyLinkedList.DoublyLinkedList;

import java.util.Iterator;

public class Stack <T> implements Iterable<T>{
    // the doubly linked list that was actually created by us.
    DoublyLinkedList<T> list = new DoublyLinkedList<>();

    // Create an empty stack
    public Stack() {

    }

    public Stack (T firstElem){
        push(firstElem);
    }

    // return the number of elements in our stack
    public int size(){
        return list.size();
    }

    // check if the stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(T elem){
        list.add(elem);
    }

    // Pop an element off the stack
    // throws an error if the stack is empty
    public T pop(){
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    public T peek(){
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    // so user can iterate if he wants to
    @Override
    public Iterator<T> iterator(){
        return list.iterator();
    }
}