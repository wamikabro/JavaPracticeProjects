package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        // although we've added 1 twice, so technically it should be on 0 and then 1 index.
        // but since we're using HashSet, it doesn't hold duplicate values.
        // let's prove it
        System.out.println(hashSet); // it will only print 123

        // we don't have direct method to print an element by index. But we can use iterator
        Iterator<Integer> iterator = hashSet.iterator();
        // if we use the counter from 0 we can also remove an element from specific index
        // but hashset does not contain order, so we can not rely on it.
        while(iterator.hasNext()){
            Integer element = iterator.next();
            System.out.print(element + ", ");
        }

        hashSet.remove(2);

        System.out.println(hashSet.contains(2));
    }
}
