package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// A promotion surprise
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // No casting needed you know!!

        b = 10;
        b = (byte) (b * b); // casting needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}
