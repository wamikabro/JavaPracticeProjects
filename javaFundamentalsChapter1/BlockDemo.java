package javaBeginnersGuideProjects.javaFundamentalsChapter1;
/*
    Demonstrates the block of code.
    Call this file BlockDemo.java

*/
public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if(i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
