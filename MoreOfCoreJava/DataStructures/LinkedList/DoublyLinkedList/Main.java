package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.DoublyLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addFirst("Hello");
        doublyLinkedList.addLast("World");

        System.out.println(doublyLinkedList.toString());

        for (Iterator<String> it = doublyLinkedList.iterator(); it.hasNext(); ) {
            String str = it.next();

            System.out.println(str);

        }
    }
}
