package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.SinglyLinkedList;
public class LinkedListt<T> {
    private Node<T> head;
    private int size;

    LinkedListt(){
        head = null;
        size = 0;
    }
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        size++;
        // check if head is null
        if(head == null){
            head = newNode; // if not then set it as first node
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        size++;
        // check if head is null
        if(head == null){
            head = newNode; // if not then set it as last node
            return;
        }

        Node<T> currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // even if user says add, call addLast method by default.
    public void add(T data){
        addLast(data);
    }

    // add by index
    public void add(int index, T data){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index is out of bounds.");

        Node<T> newNode = new Node<>(data);
        size++;

        if(index==0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> currentNode = head;
        for(int i=0; i < index - 1; i++)
            currentNode = currentNode.next;

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void removeFirst(){
        // check if head is null
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast(){
        // check if head is null
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node<T> secondLastNode = head;
        Node<T> lastNode = head.next;

        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;

    }

    // Get specific element on index
    public T get(int index){
        // taking temporary node to tiverse
        if(index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index is out of bounds.");

        Node<T> temporaryNode = head;
        for(int i=0; i<index; i++) {
            temporaryNode = temporaryNode.next;
        }

        return temporaryNode.data;
    }

    // Size getter
    public int getSize(){
        return size;
    }

    // printing the list
    public void printList(){
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<T> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
}