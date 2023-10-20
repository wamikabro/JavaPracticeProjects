package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // to add something in array
        list.add("hello");
        list.add("honey");
        list.add("how");
        list.add("are");
        list.add("you");

        System.out.println(list);

        // it takes index and sets it
        list.set(1,"Hello");
        System.out.println(list);

        // to check if list contains
        boolean contains = list.contains("hello");
        System.out.println(contains);
    }
}
