package javaBeginnersGuideProjects.ExceptionHandlingChapter9;

public class NotHandled {
    public static void main(String[] args) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");
        nums[7] = 10;
    }
}
