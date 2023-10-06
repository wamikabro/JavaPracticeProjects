package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class LowCase {
    public static void main(String[] args) {
        char ch;

        for(int i=0; i < 10; i++){
            ch = (char) ('A' + i);
            System.out.println(ch);

            ch = (char) ((int) ch | 32);

            System.out.println(ch + " ");
        }
    }
}
