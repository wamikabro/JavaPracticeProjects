package javaBeginnersGuideProjects.GenericsChapter13;
// T must be number or the class derived from Number
// eg. Integer, Long, Double etc

class NumericGenerics<T extends Number>{
    T num;

    // passing numeric object
    NumericGenerics(T num){
        this.num = num;
    }

    // Return the reciprocal
    double reciprocal(){
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        var integerNumericGenerics = new NumericGenerics<Integer>(1);

        System.out.println("Reciprocal of integerObject is " +
                integerNumericGenerics.reciprocal());
        System.out.println("Fractional component of integerObject is " + integerNumericGenerics.fraction());

        System.out.println();

        var doubleNumericGenerics = new NumericGenerics<Double>(5.50);
        System.out.println("Reciprocal of doubleObject is " +
                doubleNumericGenerics.reciprocal());
        System.out.println("Fractional component of doubleObject is " +
                doubleNumericGenerics.fraction());

        // This won't compile because it's String (Non Number Class)
       // NumericGenerics<String> stringObject = new NumericGenerics<>("Hi");
    }
}
