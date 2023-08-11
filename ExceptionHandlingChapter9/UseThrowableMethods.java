package javaBeginnersGuideProjects.ExceptionHandlingChapter9;
class ExcTest{
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Before exception is generated");

        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}
public class UseThrowableMethods {
    public static void main(String[] args) {
        try{
            ExceptionTest.genException();
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        System.out.println("After catch statement");
    }
}
