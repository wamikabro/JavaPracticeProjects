package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Wamique");
        treeMap.put(2, "Wasique");

        // it itself sorted the map
        System.out.println(treeMap);
   }
}
