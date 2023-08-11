package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Using break with nested loops
public class BreakWithNestedLoops {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            System.out.println("Outer loop count: " + i);
            System.out.println("     Inner loop count: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; // terminate loop if t is 10
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops completed.");
    }
}
