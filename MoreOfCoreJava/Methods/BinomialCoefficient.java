public class BinomialCoefficient {

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5,2));
    }
    static int factorial(int number){
        int factorial = 1;

        for(int i = 1; i <= number; i++)
            factorial *= i;

        return factorial;
    }

    static int binomialCoefficient(int n, int r){
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusRFactorial = factorial(n-r);
        return nFactorial/(rFactorial*nMinusRFactorial);
    }
}
