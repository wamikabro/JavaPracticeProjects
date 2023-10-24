package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // it will give priority to Min value by default.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.offer(20);
        priorityQueue.offer(5);

        System.out.println(priorityQueue); // if we are printing whole queue.
        // only 1st element is supposed to follow the priority.
        // if we want our priorityQueue to give whole queue in order
        // then we will have to traverse one by one.

        // now all of these polls will always give us result in min order
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
