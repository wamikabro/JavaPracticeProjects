package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
// Demonstrate a method ref for a static method
interface IntPredicate{
    boolean test(int n);
}
// This class has 3 static methods checking condition
class MyIntPredicates{
    // if number is prime
    static boolean isPrime(int n){
        if(n < 2) return false;

        for(int i=2; i <= n/i; i++)
            if((n % i) == 0)
                return false;

        return true;
    }

    // if number is even
    static boolean isEven(int n){
        return (n%2)==0;
    }

    // if number is positive
    static boolean isPositive(int n){
        return n>0;
    }
}
public class MethodRefDemo {

    // this method is taking functional interface in params
    static boolean numTest(IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;
        // Method reference to isPrime is passed to numTest()
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result) System.out.println("17 is prime");

        result = numTest(MyIntPredicates::isEven, 10);
        if(result) System.out.println("10 is even");

        result = numTest(MyIntPredicates::isPositive, 17);
        if(result) System.out.println("17 is positive");
    }
}
