package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// Demonstrate automatic conversion from long to double
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println(" L and D: " + L + " " + D);

        // L = D; // No Automatic Conversion from Double to Long
    }
}
