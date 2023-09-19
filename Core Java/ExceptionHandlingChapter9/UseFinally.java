package javaBeginnersGuideProjects.ExceptionHandlingChapter9;

import java.lang.reflect.Array;

public class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try{
            switch (what){
                case 0:
                    t = 10;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException exception){
            System.out.println("Can't divide by zero");
            return;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("No matching element found");
        }
        finally {
            System.out.println("Leaving try");
        }
    }
}

class FinallyDemo{
    public static void main(String[] args) {
        for(int i=0; i < 3; i++){
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
