package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.LinkedList;

public class QueueExampleUsingLinkedList {
    public static void main(String[] args) {
        // implementing queue using linked list
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q.poll());

        // remaining queue
        System.out.println(q);
    }
}
