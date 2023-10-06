package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
// A truth table for the logical operators
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(BooleanInNumber(p) + "\t" + BooleanInNumber(q) + "\t");
        System.out.print((BooleanInNumber(p&q)) + "\t" + (BooleanInNumber(p|q)) + "\t");
        System.out.println((BooleanInNumber(p^q)) + "\t" + (BooleanInNumber(!p)));

        p = true; q = false;
        System.out.print(BooleanInNumber(p) + "\t" + BooleanInNumber(q) + "\t");
        System.out.print((BooleanInNumber(p&q)) + "\t" + (BooleanInNumber(p|q)) + "\t");
        System.out.println((BooleanInNumber(p^q)) + "\t" + (BooleanInNumber(!p)));

        p = false; q = true;
        System.out.print(BooleanInNumber(p) + "\t" + BooleanInNumber(q) + "\t");
        System.out.print((BooleanInNumber(p&q)) + "\t" + (BooleanInNumber(p|q)) + "\t");
        System.out.println((BooleanInNumber(p^q)) + "\t" + (BooleanInNumber(!p)));

        p = false; q = false;
        System.out.print(BooleanInNumber(p) + "\t" + BooleanInNumber(q) + "\t");
        System.out.print((BooleanInNumber(p&q)) + "\t" + (BooleanInNumber(p|q)) + "\t");
        System.out.println((BooleanInNumber(p^q)) + "\t" + (BooleanInNumber(!p)));


    }

    static byte BooleanInNumber(boolean expression){
        if(expression)
            return 1;
        return 0;
    }
}
