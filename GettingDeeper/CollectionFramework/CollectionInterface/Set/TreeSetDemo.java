package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);

        // although we added them not in order
        // but, they're sorted from min to max
        // thanks to TreeSets
        System.out.println(treeSet);

    }
}
