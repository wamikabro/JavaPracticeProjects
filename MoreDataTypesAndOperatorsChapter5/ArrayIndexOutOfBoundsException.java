package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for(i = 0; i < 100; i = i+1)
            sample[i] = i;
    }
}
