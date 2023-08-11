package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class ShowBits2 {
    int numbits;

    ShowBits2(int n){
        numbits = n;
    }

    void show(long val){
        long mask = 1;

        mask <<= numbits -1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1){
            if((val & mask) != 0) System.out.println("1");
            else System.out.println("0");
            spacer++;
            if((spacer % 8) == 0){
                System.out.println(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class ShowBitsDemo{
    public static void main(String[] args) {
        ShowBits2 b = new ShowBits2(8);
        ShowBits2 i = new ShowBits2(32);
        ShowBits2 li = new ShowBits2(64);
        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n23765344");
        li.show(23765344);

        System.out.println("\nLow order 8 bits of 87987 in binary");
        b.show(87987);
    }
}
