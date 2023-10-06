package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;

public class IntegerManualBoxing {
    public static void main(String[] args) {
        Integer number = Integer.valueOf(10); // storing value using boxing
        int numberTransfer = number.intValue(); // Integer to int unboxing
        System.out.println(numberTransfer);
    }
}
