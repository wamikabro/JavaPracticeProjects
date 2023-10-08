package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.DoublyLinkedList;

import java.util.Iterator;

public class DoublyLinkedList <T> implements Iterable<T>{
    private int size = 0;
    private Node <T> head = null;
    private Node <T> tail = null;

    // Internal class for node
    private class Node <T> {
        T data;
        Node <T> prev, next;
        public Node(T data, Node<T> prev, Node<T> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        // To return something when printed
        @Override
        public String toString(){
            return data.toString();
        }
    }

    // Empty the linked list
    public void clear() {
        Node<T> trav = head;
        while(trav != null){
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }

        head = tail = trav = null;
        size = 0;
    }

    // Return the size
    public int size(){
        return size;
    }

    // Is linked list empty?
    public boolean isEmpty(){
        return size() == 0;
    }

    // Add element to the tail by default if only add is called
    public void add(T elem){
        addLast(elem);
    }

    public void addLast(T elem){
        // check if linked list is empty
        if(isEmpty())
            head = tail = new Node<T> (elem, null, null);
        else{
            tail.next = new Node<T> (elem, tail, null);
            tail = tail.next;
        }
        size++;
     }
    // Add element to the beginning
    public void addFirst(T elem){
         // check if linked list is empty
        if(isEmpty())
            head = tail = new Node<T> (elem, null, null);
        else{
            head.prev = new Node<T> (elem, null, head);
            head = head.prev;
        }
        size++;
    }

    // It will return the top data. (just like queue)
    public T peekFirst(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Empty list");
        return head.data;
    }

    // It will return the last data (just like stack)
    public T peekLast(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Empty list");
        return tail.data;
    }

    public T removeFirst(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Empty list");

        // take out the data first because it will be returned to the caller
        T data = head.data;

        // move the head to the next of the head
        head = head.next;
        --size; // remove 1 from the size

        // If the list is now empty
        // in other words if size is 0
        if(isEmpty())
            // set tail to null too.
            // since head is already null because head was set to head.next, which was null
            tail = null;
        else head.prev = null; // head node has no previous so. it must be null
        // otherwise it will be set to the address before it became head itself.

        // returning the data will just show the caller that what was actually removed.
        // it was optional.
        return data;
    }

    public T removeLast(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Empty list.");

        T data = tail.data;
        tail = tail.prev;
        --size;

        if(isEmpty())
            head = null;

        else tail.next = null; // since it's last node. so it must not have next node.

        return data;
    }

    // the method will remain private
    // because user shouldn't have access to Node class and stuff
    // This method will be only used by this class itself.
    private T remove(Node <T> node){
        // if previous node is null, that means it's head node
        // since head node's previous node is always null.
        // so we will let the deleteFirst method handle this.
        if(node.prev == null)  return removeFirst();

        // if next node is null, that means it's tail node
        // since tail node's next node is always null.
        // so we will let the deleteLast method handle this.
        if(node.next == null) return removeLast();

        // ignore the node by setting previous of its next to previous of its own
        node.next.prev = node.prev; // its previous is now previous of its next


        // ignore the node by setting next of its previous to next of its own
        node.prev.next = node.next; // its next is now next of its previous

        // Temporary store the data to return to the caller
        T data = node.data;

        // clean the memory of this node now
        node.data = null;
        node = node.prev = node.next = null;

        // decrease the size since node has been deleted
        --size;

        // return the data
        return data;
    }

    // this method will utilize the private remove method
    // it is public itself because it takes index
    public T removeAt(int index){
        // verify that the provided index is valid.
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int i;
        Node<T> trav;

        // Search from the front
        if(index <size/2){
            for(i=0, trav = head; i != index; i++)
                trav = trav.next;

        } // search from the back
        else {
            for(i = size - 1, trav = tail; i != index; i--)
                trav = trav.prev;
        }
        // here we have utilized out private method to remove whole node.
        return remove(trav);
    }

    // to remove particular value from the linked list
    public boolean remove(Object obj){
        Node <T> trav = head;

        // support searching for null
        if(obj == null){
            for(trav = head; trav != null; trav = trav.next){
                if(trav.data == null){
                    remove(trav);
                    return true;
                }
            }
        }else{ // non null value
            for(trav = head; trav != null; trav = trav.next){ // this is also good way to increment
                // keep on comparing given data in the linked list
                if(obj.equals(trav.data)){
                    remove(trav);
                    return true;
                }
            }
        }

        // if not found
        return false;
        // even if the method doesn't remove anything
        // and the user don't read the return value
        // this method will do nothing (no harm)
        // but if the match is found, it will be removed
    }

    // find the index of a particular value in the linked list
    public int indexOf(Object obj){
        int index = 0;
        Node <T> trav = head;

        // support searching for nll
        if(obj == null){
            for(trav = head; trav != null; trav = trav.next, index++)
                if(trav.data == null)
                    return index;
        }
        // non null object
        else{
            for(trav = head; trav != null; trav = trav.next, index++)
                if(obj.equals(trav.data))
                    return index;
        }
        // if the object is not found
        return -1; // we won't return 0 since 0 is also an index
    }

    // check is a value is in the list
    // we won't write another code since we have the code of index of
    public boolean contains(Object obj){
        return indexOf(obj) != -1; // if -1 is returned, means list doesn't contain.
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private Node<T> trav = head;
            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        Node<T> trav = head;
        while(trav != null){
            sb.append(trav.data + ", ");
            trav = trav.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

}
