package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Guess the letter game with an else.
public class IfElse {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'W';

        System.out.print("Guess a letter between A and Z that I am thinking: ");
        ch = (char) System.in.read(); // read a character from the keyboard

        if(ch == answer) System.out.println("Correct Guess!!");
        else System.out.println("Wrong Guess :(");

    }
}
