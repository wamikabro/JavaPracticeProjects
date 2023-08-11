package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// Demonstrate block scope.
public class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if(x == 10){ // start new scope
            int y = 20; // known only this if block

            // x and y both are known here

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 40; // Error: y not known here

        // x is still known here.
        System.out.println("x is " + x);
    }
}
