package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;

public class AutoboxingUnboxingExpressions {
    public static void main(String[] args) {
        Integer integerObject1, integerObject2;
        int i;

        integerObject1 = 99;
        System.out.println("Original value of integerObject 1: " + integerObject1);

        // The following automatically unboxes integerObject1
        // performs the increment, and then reboxes
        // the result back into integerObject1.
        ++integerObject1;
        System.out.println("After ++integerObject1: " + integerObject1);

        // Here, integerObject1 is unboxed, its value is increased by 10.
        // and the result is boxed and stored back in integerObject1
        integerObject1 += 10;
        System.out.println("After integerObject1 += 10:  " + integerObject1);

        // Here, integerObject1 is unboxed, the expression is
        // evaluated, and the result is reboxed and
        // assigned to integerObject2
        integerObject2 = integerObject1 + (integerObject1 / 3);
        System.out.println("integerObject2 after expression: " + integerObject2);

        // The same expression is evaluated, but the
        // result is not reboxed.
        i = integerObject1 + (integerObject1 / 3);
        System.out.println("i after expression: " + i);
    }

}
