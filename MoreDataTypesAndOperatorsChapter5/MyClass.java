package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class MyClass {
    private int i;

    MyClass(int k){
        i = k;
    }

    int geti(){ return i;}
    void seti(int k){ if(k >= 0) i = k;}

    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);

        System.out.println("Value of i in mc is now " + mc.geti());
    }
}
