package javaBeginnersGuideProjects.javaFundamentalsChapter1;
/*
 This program converts gallons to liters
*/
public class GalToLit {
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds the number of liters

        gallons = 10; // start with 10 gallons

        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + "gallons is " + liters + " liters.");
    }
}
