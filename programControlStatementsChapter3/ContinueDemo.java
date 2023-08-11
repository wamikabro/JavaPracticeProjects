package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Use continue.
public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        // print even numbers between 0 and 20
        for(i = 0; i<=20; i++){
            if((i%2) != 0) continue; // iterate
            System.out.println(i);
        }
    }
}
