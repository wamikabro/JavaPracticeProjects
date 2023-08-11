package javaBeginnersGuideProjects.ExceptionHandlingChapter9;

public class ThrowsDemo2 {
    public static char prompt(String str)
    throws java.io.IOException{
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try{
            ch = prompt("Enter a letter");
        }
        catch  (java.io.IOException exception){
            System.out.println("I/O exeption occured.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}
