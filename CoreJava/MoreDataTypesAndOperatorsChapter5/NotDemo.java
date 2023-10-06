package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        for(int t=128; t > 0; t = t/2){
            if((b &  t) != 0) System.out.println("1 ");
            else System.out.println("0 ");
        }
        System.out.println();

        b = (byte) -b;

        for(int t=128; t > 0; t = t/2){
            if((b & t) != 0) System.out.println("1 ");
            else System.out.println("0 ");
        }
    }
}
