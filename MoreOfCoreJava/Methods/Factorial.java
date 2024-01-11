public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int number){
        int factorial = 1;

        for(int i = number; i >= 1; i--, factorial*=number);

        return factorial;
    }

}
