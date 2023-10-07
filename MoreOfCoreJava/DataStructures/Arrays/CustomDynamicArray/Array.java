package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Arrays.CustomDynamicArray;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Array <T> implements Iterable<T>{
    private T[] array;
    private int len = 0;    // length to show user
    private int capacity = 0; // actual array size

    public Array(){
        this(16);
    }

    public Array(int capacity){
        if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T elem){
        array[index] = elem;
    }

    public void clear(){
        for(int i=0; i < capacity; i++)
            array[i] = null;
        len = 0;
    }

    public void add(T elem){
        // Resize if
        if(len + 1 >= capacity){
            // set as 1 if capacity is 0.
            // In our case it won't be zero if default constructor will be called
            // But if user will give 0, then the problem can occur.
            // That's why we good people handling it!
            if(capacity == 0) capacity = 1;
            else capacity *= 2; // double the size
            T[] new_array = (T[]) new Object[capacity];
            for(int i = 0; i < len; i++)
                new_array[i] = array[i];
            array = new_array; // now we have given whole thing to "array" reference
            // java gc gotta remove the garbage!
        }
        array[len++] = elem; // now we can safely add the element since array has been doubled.
    }

    public T removeAt(int rm_index){
        if(rm_index >= len && rm_index < 0) throw new IndexOutOfBoundsException();
        T data = array[rm_index];
        T[] new_array = (T[]) new Object[len-1];
        for(int i=0, j=0; i < len; i++, j++)
            if(i == rm_index) j--; // Skip over rm_index by fixing j temporarily
            else new_array[j] = array[i];
        array = new_array;
        capacity = --len;
        return data;
    }

    public boolean remove(Object obj){
        for(int i = 0; i < len; i++){
            if(array[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj){
        for(int i = 0; i < len; i++)
            if(array[i].equals(obj))
                return i;
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }


    @Override
    public Iterator<T> iterator() {

        // Till it has next, it will return next
        // And our whole iterator will be returned to the caller.
        return new Iterator<T> (){
          int index = 0;
          public boolean hasNext(){
              return index < len;
          }
          public T next(){
              return array[index++];
          }
        };
    }

    @Override
    public String toString(){
        if(len == 0) return "[]";
        else{
            StringBuilder stringBuilder = new StringBuilder(len).append("[");
            for(int i = 0; i < len; i++)
                stringBuilder.append(array[i] + ", ");
            return stringBuilder.append("]").toString();
        }
    }
}
