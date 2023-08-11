package javaBeginnersGuideProjects.GenericsChapter13;

// Using a Wildcard.
class NumericFunctions<T extends Number>{
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFunctions(T n){
        num = n;
    }

    // Return the reciprocal.
    double reciprocal(){
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    // Determine if the absolute values of two
    // objects are the same
    boolean absEqual(NumericFunctions<?> ob){
        if(Math.abs(num.doubleValue()) ==
        Math.abs(ob.num.doubleValue())) return true;

        return false;
    }
}

// Demonstrating a Wildcard
public class WildCard {
    public static void main(String[] args) {
        NumericFunctions<Integer> integerObject =
        new NumericFunctions<>(6);

        NumericFunctions<Double> doubleObject =
                new NumericFunctions<>(-6.0);

        NumericFunctions<Long> longObject =
                new NumericFunctions<>(5L);

        System.out.println("Testing integerObject and doubleObject.");
        if(integerObject.absEqual(doubleObject))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing integerObject and longObject");
        if(integerObject.absEqual(longObject))
            System.out.println("Absolute values are equal");
        else
            System.out.println("Absolute values differ.");
    }
}
