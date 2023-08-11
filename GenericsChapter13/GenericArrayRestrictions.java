package javaBeginnersGuideProjects.GenericsChapter13;
// Generics and arrays.
class Gene<T extends  Number>{
    T ob;

    T vals[]; // OK

    Gene(T o, T[] nums){
        ob = o;

        // This statement is illegal.
        // vals = new T[10]; // can't create an array of T

        // But, this statement is OK
        vals = nums; // Ok to assign reference to existing array.
    }
}


public class GenericArrayRestrictions {
    public static void main(String[] args) {
        Integer n[] = {1,2,3,4,5};

        Gene<Integer> iOb = new Gene<Integer>(50, n);

        // Can't create an array of type-specific generic reference
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong

        // This is ok
        Gen<?> gens[] = new Gen<?>[10];
    }
 }
