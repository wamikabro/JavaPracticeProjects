package javaBeginnersGuideProjects.programControlStatementsChapter3;
// Read a character from the keyboard.
public class KeyboardInput {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;

        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a character

        System.out.println("Your key is: " + ch);
    }
}
