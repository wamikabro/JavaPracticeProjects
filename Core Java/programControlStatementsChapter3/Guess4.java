package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Guess the letter game, 4th version.
public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ignore, answer = 'W';

        do {
            System.out.print("Can you guess a letter I am thnking of? : ");

            // read a character
            ch = (char) System.in.read();

            // discard any other characters in the input buffer
            do{
                ignore =  (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) System.out.println("Correct Guess!");
            else{
                System.out.print(" You're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try Again!\n");
            }
        } while(answer != ch);
    }
}
