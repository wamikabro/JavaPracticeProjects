package javaBeginnersGuideProjects.inheritanceChapter7;
class TwoDShape5{
    private double width;
    private double height;

    TwoDShape5(){
        width = height = 0.0;
    }

    TwoDShape5(double w, double h){
        width = w;
        height = h;
    }

    TwoDShape5(double x){
        width = height = x;
    }

    double getWidth() { return width;}
    double getHeight(){ return height;}
    void setWidth(double w){ width = w;}
    void setHeight(double h){ height = h;}

    void showDim(){
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle5 extends TwoDShape5{
    private String style;

    Triangle5(){
        super();
        style = "none";
    }

    Triangle5(String s, double w, double h){
        super(w, h);

        style = s;
    }

    Triangle5(double x){
        super(x);
        style = "filled";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }

}
public class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5();
        Triangle5 t2 = new Triangle5("outlined", 8.0, 1.20);
        Triangle5 t3 = new Triangle5(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}
