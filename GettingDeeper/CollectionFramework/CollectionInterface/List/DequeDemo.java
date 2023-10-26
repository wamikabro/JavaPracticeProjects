package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
    }
}
