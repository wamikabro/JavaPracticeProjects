package javaBeginnersGuideProjects.inheritanceChapter7;
abstract  class TwoDShape9{
    private double width;
    private double height;
    private String name;

    TwoDShape9(){
        width = height = 0.0;
        name = "none";
    }

    TwoDShape9(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    TwoDShape9(double x, String n){
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob){
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

    abstract double area();
}
class Triangle9 extends TwoDShape9{
    private String style;

    Triangle9(){
        super();
        style = "none";
    }

    Triangle9(String s, double w, double h){
        super(w, h, "triangle");
        style = s;
    }

    Triangle9(double x){
        super(x, "triangle");
        style = "filled";
    }

    Triangle9(Triangle9 ob){
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
class Rectangle9 extends TwoDShape8{
    Rectangle9(){
        super();
    }

    Rectangle9(double w, double h){
        super(w, h, "rectangle");
    }

    Rectangle9(double x){
        super(x, "rectangle");
    }

    Rectangle9(Rectangle9 ob){
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
public class AbsShape {
    public static void main(String[] args) {
        TwoDShape8 shapes[] = new TwoDShape8[5];

        shapes[0] = new Triangle8("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10, 4);
        shapes[3] = new Triangle8(7.0);

        for(int i = 0; i < shapes.length; i++){
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
