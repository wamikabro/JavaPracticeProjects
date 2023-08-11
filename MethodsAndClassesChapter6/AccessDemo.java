package javaBeginnersGuideProjects.MethodsAndClassesChapter6;
class MyClass{
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}
public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // ob.alpha = 10; // wrong because alpha is private

        ob.beta = 88;
        ob.gamma = 99;

    }
}
