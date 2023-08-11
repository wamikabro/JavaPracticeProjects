package javaBeginnersGuideProjects.GenericsChapter13;
// Simple generic class
// T is a type parameter that will be replaced
// by real type when object of type Generic is created.
class Generic<T> {
    T object; // declare an object of type T

    // Passing the reference to an object of type T
    Generic(T object){
        this.object = object;
    }

    // Return object
    T getObject(){
        return object;
    }

    // Show type of T.
    void showType(){
        System.out.println("Type of T is " + object.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Create a Generic reference for Integers.
        Generic<Integer> integerObject;

        // Create a Generic<Integer> object and assign its
        // reference to integerObject. Autoboxing
        integerObject = new Generic<Integer>(50);

        // Show the type of data used
        integerObject.showType();

        // Get the value in integerObject. Notice that
        // no cast is needed
        int v = integerObject.getObject();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Generic object for Strings.
        Generic<String> stringObject = new Generic<String>("Hi");

        // Show the type of data used
        stringObject.showType();

        // Get the value of stringObject.
        String str = stringObject.getObject();
        System.out.println("value: " + str);
    }
}
