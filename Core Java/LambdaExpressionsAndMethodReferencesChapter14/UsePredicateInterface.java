package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;

import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        // This lambda uses Predicate<Integer> to determine
        Predicate<Integer> isEven = n -> (n % 2) == 0;

        if(isEven.test(4)) System.out.println("4 is even");

        if(!isEven.test(5)) System.out.println("5 is odd.");


       
    }
}
