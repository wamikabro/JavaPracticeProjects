package javaBeginnersGuideProjects.inheritanceChapter7;
class TwoDShape8{
    private double width;
    private double height;
    private String name;

    TwoDShape8(){
        width = height = 0.0;
        name = "none";
    }

    TwoDShape8(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape8(double x, String n){
        width = height = x;
        name = n;
    }

    TwoDShape8(TwoDShape8 ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() { return width;}
    double getHeight(){ return height;}
    void setWidth(double w){ width = w;}
    void setHeight(double h){ height = h;}
    String getName(){ return name;}
    void showDim(){
        System.out.println("Width and height are " +
                width + " and " + height);
    }

    double area(){
        System.out.println("area() must be overridden.");
        return 0.0;
    }
}
class Triangle8 extends TwoDShape8{
    private String style;

    Triangle8(){
        super();
        style = "none";
    }

    Triangle8(String s, double w, double h){
        super(w, h, "triangle");
        style = s;
    }

    Triangle8(double x){
        super(x, "triangle");
        style = "filled";
    }

    Triangle8(Triangle8 ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }

}
class Rectangle8 extends TwoDShape8{
    Rectangle8(){
        super();
    }

    Rectangle8(double w, double h){
        super(w, h, "rectangle");
    }

    Rectangle8(double x){
        super(x, "rectangle");
    }

    Rectangle8(Rectangle8 ob){
        super(ob);
    }

    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}

public class DynamicShapes {
    public static void main(String[] args) {
        TwoDShape8 shapes[] = new TwoDShape8[5];

        shapes[0] = new Triangle8("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10, 4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDShape8(10, 20, "generic");

        for(int i = 0; i < shapes.length; i++){
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
