package javaBeginnersGuideProjects.inheritanceChapter7;
class Y2 extends X{
    int b;
    Y2(int i, int j){
        super(j);
        b = i;
    }
}
public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y2 y = new Y2(5, 6);

        x2 = x;
        System.out.println("x2.a: " + x2.a);

        x2 = y; // okay because now y is derived from x2
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;
       // x2.b = 27; // x2 doesn't have 'b'



    }
}

