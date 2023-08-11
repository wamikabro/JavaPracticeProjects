package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;

public class Wrap {
    public static void main(String[] args) {
        Integer integerObject = Integer.valueOf(100);

        int i = integerObject.intValue();

        System.out.println(i + " " + integerObject); // displays 100 100
    }
}
