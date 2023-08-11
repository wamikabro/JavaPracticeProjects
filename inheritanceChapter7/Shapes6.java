package javaBeginnersGuideProjects.inheritanceChapter7;
class TwoDShape6{
    private double width;
    private double height;

    TwoDShape6(){
        width = height = 0.0;
    }

    TwoDShape6(double w, double h){
        width = w;
        height = h;
    }

    TwoDShape6(double x){
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
class Triangle6 extends TwoDShape6{
    private String style;

    Triangle6(){
        super();
        style = "none";
    }

    Triangle6(String s, double w, double h){
        super(w, h);

        style = s;
    }

    Triangle6(double x){
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
class ColorTriangle extends Triangle6{
    private String color;

    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color = c;
    }

    String getColor(){ return color;}

    void showColor(){
        System.out.println("Color is " + color);
    }
}
public class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new
                ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new
                ColorTriangle("Red", "filled", 2.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
