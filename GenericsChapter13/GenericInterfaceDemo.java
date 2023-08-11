package javaBeginnersGuideProjects.GenericsChapter13;
// Implement Containment using an array to
// hold the values.
public class GenericInterfaceDemo{
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        GenericInterface<Integer> ob = new GenericInterface<>(x);

        if(ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if(ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");

        // The following is illegal because ob
        // is an Integer Containment and 9.25 is
        // a Double value.
        // if (ob.contains(9.25)) // Illegal!
        // System.out.println("9.25 is in ob");
    }
}

class GenericInterface<T> implements Containment<T> {
    T[] arrayRef;

    GenericInterface(T[] o){
        arrayRef = o;
    }

    // Implement contains()
    public boolean contains (T o ){
        for(T x : arrayRef)
            if(x.equals(o))
                return true;
        return false;
    }
}
