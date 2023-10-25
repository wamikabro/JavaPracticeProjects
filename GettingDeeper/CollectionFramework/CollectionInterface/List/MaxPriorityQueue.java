package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        priorityQueue.add(10);
        priorityQueue.offer(20);
        priorityQueue.offer(5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        System.out.println(Comparator.reverseOrder());
    }
}
