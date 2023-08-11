package javaBeginnersGuideProjects.ExceptionHandlingChapter9;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }catch (ArithmeticException exception){
            System.out.println("Exception Caught.");
        }
        System.out.println("After try/catch block.");
    }
}
