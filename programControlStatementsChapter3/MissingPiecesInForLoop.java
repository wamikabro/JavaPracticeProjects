package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Parts of the for can be empty
public class MissingPiecesInForLoop {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10; ){
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }


        // Move more out of the for loop.
        i = 0; // move initialization out of the loop.
        for(; i < 10; ){
            System.out.println(" Pass #" + i);
            i++; // increment loop control var
        }

        // Loop without body
        int sum = 0;
        for(i = 1; i <=5; sum += i++);

        System.out.println("Sum is " + sum);
    }
}
