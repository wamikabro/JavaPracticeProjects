package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // thanks to linked HashSet it store values in order as added by the user
        // by keeping elements linked.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        // although we've added 1 twice, so technically it should be on 0 and then 1 index.
        // but since we're using HashSet, it doesn't hold duplicate values.
        // let's prove it
        System.out.println(linkedHashSet); // it will only print 123

        // we don't have direct method to print an element by index. But we can use iterator
        Iterator<Integer> iterator = linkedHashSet.iterator();
        // if we use the counter from 0 we can also remove an element from specific index
        while(iterator.hasNext()){
            Integer element = iterator.next();
            System.out.print(element + ", ");
        }

        linkedHashSet.remove(2);

        System.out.println(linkedHashSet.contains(2));
    }
}
