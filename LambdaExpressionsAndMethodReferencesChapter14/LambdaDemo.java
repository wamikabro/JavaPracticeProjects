package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;

// Functional Interface with No Parameters
interface MyValue{
    double getValue();
}

// Functional Interface with Parameters
interface MyParamValue{
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myValue; // declare an interface reference

        myValue = () -> 90.4;

        // Print
        System.out.println("Constant Value: " + myValue.getValue());

        // Parameterized
        MyParamValue myParamValue = n -> 1.0 / n;
        System.out.println("Reciprocal of 2 is " +
                myParamValue.getValue(2));
        System.out.println("Reciprocal of 6 is " +
                myParamValue.getValue(6));

        // Can not give any other value since interface abstract
        // methods only accept double as we defined them.
    }
}
