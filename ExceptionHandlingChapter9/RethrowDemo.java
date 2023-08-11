package javaBeginnersGuideProjects.ExceptionHandlingChapter9;
class Rethrow{
    public static void genException(){
        int numer[] = {4, 8, 16, 32, 64, 128};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for(int i=0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("No matching element found.");
            }
            catch (Throwable ex){
                System.out.println("Some exception occured.");
            }
        }
    }


}
public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Fatal error");
        }
    }
}
