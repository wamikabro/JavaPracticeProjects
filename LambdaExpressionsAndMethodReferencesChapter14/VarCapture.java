package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
// An example of capturing a local variable from the enclosing scope.
@FunctionalInterface
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        // A local variable that can be captured
        int num = 10;

        MyFunc myLambda = (n) -> {
            // This use of num is ok
            int v = num + n;

            // This is wrong, we can not modify
            // local variable in lambda
            // num++;

            return v;
        };

        // Use the lambda. This will display 18
        System.out.println(myLambda.func(8));

        // The following line would also cause an error
        // coz num is acting like final coz we used it in lambda
        // num = 9;
    }
}
