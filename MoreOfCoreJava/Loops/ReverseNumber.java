package javaBeginnersGuideProjects.MoreOfCoreJava.Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1002;

        while(number>0){
            int lastDigit = number%10;
            number = number/10;

            System.out.print(lastDigit);
        }
    }
}
