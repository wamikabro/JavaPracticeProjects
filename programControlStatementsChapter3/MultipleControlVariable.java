package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Demonstrating Multiple Control Variable
public class MultipleControlVariable {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
