package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
// Use a method reference to an instance method.

// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate2{
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x){
        v = x;
    }

    int getNum(){ return v;}

    // Return true if n is a factor of v.
    boolean isFactor(int n){
        return (v%n) == 0;
    }
}

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // method reference to isFactor
        IntPredicate2 ip = myNum::isFactor;

        // call isFactor() via test()
        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " +
                myNum.getNum());

        // This time, a method reference to isFactor on myNum2 is created
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " +
                myNum2.getNum());
    }
}
