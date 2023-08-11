package javaBeginnersGuideProjects.ExceptionHandlingChapter9;
class NonIntResultException extends Exception{
    int n;
    int d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return "Result of " + n + " / " + d + " is non-int";
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for(int i=0; i < numer.length; i++) {
            try {
                if((numer[i]%2) != 0)
                    throw new NonIntResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);
            }
            catch (ArithmeticException exception){
                System.out.println("Can't divide by Zero");
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("No matching element found.");
            }
            catch(NonIntResultException exception){
                System.out.println(exception);
            }
        }
    }
}
