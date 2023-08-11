package javaBeginnersGuideProjects.GenericsChapter13;

// A simple  generic class with two type parameters:
// T and V
class TwoGenerics<T, V>{
    T object1;
    V object2;

    // Pass the constructor ref to objects of
    // Type T and V
    TwoGenerics(T object1, V object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    // Show types of T and V
    void showTypes(){
        System.out.println("Type of T is: " +
                object1.getClass().getName());

        System.out.println("Type of V is: " +
                object2.getClass().getName());
    }

    T getObject1(){
        return object1;
    }

    V getObject2(){
        return object2;
    }
}


public class TwoGenericsDemo {
    public static void main(String[] args) {
        TwoGenerics<String, String> twoGenerics = new TwoGenerics<>("Hello", "Hello Again");

        // Show the types
        twoGenerics.showTypes();

        // Obtain and show strings
        String stringOne = twoGenerics.getObject1();
        String stringTwo = twoGenerics.getObject2();

        System.out.println("String 1: " + stringOne);
        System.out.println("String 2: " + stringTwo);
    }
}
