package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// Demonstrate the % operator
public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3;
        drem = 10.0 % 3;

        System.out.println("Result and reminder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and reminder of 10.0 / 3.0: " + dresult + " " + drem);
    }

}
