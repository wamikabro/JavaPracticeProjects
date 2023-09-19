package javaBeginnersGuideProjects.GenericsChapter13;

class WithoutWildCardGeneric<T extends Number>{
    T obj;

    WithoutWildCardGeneric(T obj){
        this.obj = obj;
    }

    void TakeNumericInput(WithoutWildCardGeneric<T> obj){
        System.out.println("Can only take the type of Generic Object that was passed to class.");
    }
}
public class WithoutWildCard {
    public static void main(String[] args) {
        WithoutWildCardGeneric<Integer>
                withoutWildCardGeneric = new WithoutWildCardGeneric<>(10);
        WithoutWildCardGeneric<Integer>
                withoutWildCardGeneric2 = new WithoutWildCardGeneric<>(20);

        withoutWildCardGeneric.TakeNumericInput(withoutWildCardGeneric2);

        WithoutWildCardGeneric<Double>
                withoutWildCardGeneric3 = new WithoutWildCardGeneric<>(20.2D);

        // this line of code will cause error because of type safety
        // withoutWildCardGeneric.TakeNumericInput(withoutWildCardGeneric3);

    }
}
