package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.PriorityQueue;

import java.util.*;
// this class will only accept Comparable object eg. String, Integer etc.
public class PQueue<T extends Comparable<T>>{
    // the number of elements currently inside the heap
    private int heapSize = 0;

    // the internal capacity of the heap
    private int heapCapacity = 0;

    // a dynamic list to track the elements insdie the heap
    private List<T> heap = null;

    // this map keeps the track of the possible indicies a particular
    // node value is found in the heap.
    // having this mapping lets us have 0(log(n)) removals and 0(1) element containment check
    // at the cost of some additional space and minor overhead
    private Map<T, TreeSet<Integer>> map = new HashMap<>();
    // Construct and initially empty priority queue
    public PQueue(){
        this(1);
    }
    public PQueue(int sz){
        heap = new ArrayList<>(sz);
    }
    // construct priority queue
    public PQueue (Collection <T> elems){
        this(elems.size());
        for(T elem: elems) add(elem);
    }
    // to check if priority queue is empty
    public boolean isEmpty(){
        return size() == 0;
    }
    // clear everything inside the heap 0(n)
    public void clear(){
        for(int i = 0; i < heapCapacity; i++){
            heap.set(i, null);
            heapSize = 0;
            map.clear();
        }
    }
    // return the size of the heap
    public int size(){
        return heapSize;
    }

    // return the value of the element with the highest priority
    // return null if heap is empty
    public T peek(){
        if(isEmpty()) return null;
        return heap.get(0);
    }
    // Removes the root of the heap, 0(log(n))
    public T poll(){
        return removeAt(0);
    }

    // test if an element is in heap, 0(1)
    public boolean contains(T elem){
        // Map lookup to check containment
        // honestly, it's not that worth it since it takes up the space
        // and adds an overhead
        if(elem == null) return false;
        return map.containsKey(elem);

        // if we didn't use map, we would be trying to find the value in Array
        // it would've taken linear time 0(n)
        /*
        for(int i = 0; i < heapSize; i++)
            if(heap.get(i).equals(elem))
                return true;
        return false;
        */
    }
    // adds an element to the priority queue
    // the element must not be null, 0(log(n))
    public void add(T elem){
        if(elem == null) throw new IllegalArgumentException();

        if(heapSize < heapCapacity){
            heap.set(heapSize, elem);
        } else{
           heap.add(elem);
           heapCapacity++;
        }

        mapAdd(elem, heapSize);

        swim(heapSize);
        heapSize++;
    }
    // test if the value of node i <= node j
    // just because we needed to compare, that's why we've set bounds to only add Comparable
    private boolean less(int i, int j){
        T node1 = heap.get(i);
        T node2 = heap.get(j);

        return node1.compareTo(node2) <= 0;
    }
    // Bottom up node swim, 0(log(n))
    private void swim(int k){
        // grab the index of the next parent node WRT to k
        int parent = (k-1) / 2;

        // keep swimming while we have not reached the
        // root and while we're less than our parent.
        while(k > 0 && less(k, parent)){
            // exchange k with the parent
            swap(parent, k);
            k = parent;

            // grab the index of the next parent node WRT to k
            parent = (k-1) / 2;
        }
    }
    private void sink(int k){
        while (true){
            int left = 2 * k + 1;
            int right = 2 * k + 2;
            int smallest = left; // assume left is the smallest node of the two children

            // find which is smaller left or right
            // If right is smaller set smallest to be right
            if(right < heapSize && less(right, left))
                smallest = right;

            // stop if we're outside the bounds of the tree
            // or stop early if we cannot sink k anymore
            if(left >= heapSize || less(k, smallest)) break;

            // Move down the tree following the smallest node
            swap(smallest, k);
            k = smallest;
        }
    }

    // swap two nodes. 0(1)
    private void swap(int i, int j){
        T iElem = heap.get(i);
        T jElem = heap.get(j);

        heap.set(i, jElem);
        heap.set(j, iElem);

        mapSwap(iElem, jElem, i, j);
    }

    // remove a particular element in the heap. 0(log(n))
    public boolean remove(T element){
        if(element == null) return false;

        Integer index = mapGet(element);
        if(index != null) removeAt(index);
        return index != null;
    }

    // Removes a node at particular index, 0(log(n))
    private T removeAt(int i) {
        if (isEmpty()) return null;

        heapSize--;

        T removedData = heap.get(i);
        swap(i, heapSize);

        // obliterate the value
        heap.set(heapSize, null);
        mapRemove(removedData, heapSize);

        // removed last element
        if (i == heapSize) return removedData;

        T elem = heap.get(i);

        // try sinking element
        sink(i);

        // if sinking did not work try swimming
        if (heap.get(i).equals(elem))
            swim(i);
        return removedData;
    }
    private void mapAdd(T value, int index){
        TreeSet<Integer> set = map.get(value);

        if(set == null){
            set = new TreeSet<>();
            set.add(index);
            map.put(value, set);
        }  else
            set.add(index);
    }
    private void mapRemove(T value, int index){
        TreeSet <Integer> set = map.get(value);
        set.remove(index);
        if(set.size() == 0) map.remove(value);
    }
    private Integer mapGet(T value){
        TreeSet <Integer> set = map.get(value);
        if(set != null) return set.last();
        return null;
    }
    private void mapSwap(T val1, T val2, int val1Index, int val2Index){
        Set <Integer> set1 = map.get(val1);
        Set <Integer> set2 = map.get(val2);

        set1.remove(val1Index);
        set2.remove(val2Index);

        set1.add(val2Index);
        set2.add(val1Index);
    }
    @Override
    public String toString(){
        return heap.toString() ;
    }
}
