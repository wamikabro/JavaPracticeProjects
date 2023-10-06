package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Guess the letter game with Nested If.
public class NestedIf {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'W';

        System.out.print("Guess a letter between A and Z that I am thinking: ");
        ch = (char) System.in.read(); // read a character from the keyboard

        if(ch == answer) System.out.println("Correct Guess!!");
        else{
            System.out.println("Wrong Guess :(");

            // a nested if
            if(ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }

    }
}
