package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Since ArrayList and LinkedList both share same interface
        // They've got a lot of similar methods that were in interface
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for(int elem: list){
            System.out.println(elem);
        }
    }
}
