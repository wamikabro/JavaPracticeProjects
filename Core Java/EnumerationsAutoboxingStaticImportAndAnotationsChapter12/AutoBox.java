package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;

public class AutoBox {
    public static void main(String[] args) {
        Integer integer = 10; // autoboxing an int value

        int i = integer; // auto unboxing an int

        System.out.println(i + " " + integer);
    }
}
