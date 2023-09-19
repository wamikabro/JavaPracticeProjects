package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Read input until a q is received,
public class InfiniteLoopBreak {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for(;;){
            ch = (char) System.in.read(); // get a char
            if(ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}
