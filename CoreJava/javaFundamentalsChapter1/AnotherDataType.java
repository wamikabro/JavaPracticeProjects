package javaBeginnersGuideProjects.javaFundamentalsChapter1;
/*
* This program illustrates the differences between int and double
* Call this file AnotherDataType.java
*/
public class AnotherDataType {
    public static void main(String[] args) {
        int v; // this declares an int variable
        double x; // this declares a floating-point variable

        v = 10; // assign v the value 10
        x = 10.0; // assign x the value 10.0

        System.out.println("Original value of v: " + v);
        System.out.println("Original Value of x: " + x);
        System.out.println(); // print a blank line

        // now, divide both by 4
        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);

    }
}
