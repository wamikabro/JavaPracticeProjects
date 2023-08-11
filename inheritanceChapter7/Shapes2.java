package javaBeginnersGuideProjects.inheritanceChapter7;
class TwoDShape2{
    private double width;
    private double height;

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    void setWidth(double w){ width = w;}
    void setHeight(double h) {height = h;}

    void showDim(){
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle2 extends TwoDShape2{
    String style;

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangel is " + style);
    }
}
public class Shapes2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setHeight(4.0);
        t1.setWidth(4.0);

        t1.style = "filled";

        t2.setHeight(12.0);
        t2.setWidth(8.0);
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Infor for t2: ");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area is " + t2.area());
    }
}
