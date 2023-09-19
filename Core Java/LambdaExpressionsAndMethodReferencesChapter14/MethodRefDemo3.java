package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
// Use an instance method reference to refer

interface MyIntNumPredicate{
    boolean test(MyIntNum2 mv, int n);
}

class MyIntNum2{
    private int v;

    MyIntNum2(int x) {
        v = x;
    }

    int getNum(){
        return v;
    }

    // Return true if n is a factor of v.
    boolean isFactor(int n){
        return (v % n) == 0;
    }
}

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum2 myNum = new MyIntNum2(12);
        MyIntNum2 myNum2 = new MyIntNum2(16);

        // This makes inp refer to the instance method isFactor()
        MyIntNumPredicate inp = MyIntNum2::isFactor;

        result = inp.test(myNum, 3);

        if(result)
            System.out.println("3 is a factor of" + myNum.getNum());

        // the following calls isFactor() on myNum2
        result = inp.test(myNum2, 3);

        if(!result)
            System.out.println("3 is not a factor of" + myNum2.getNum());

    }
}
