package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// Demonstrate casting.
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b); // now byte only has 1

        b = 89; // ASCII code for Y
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
