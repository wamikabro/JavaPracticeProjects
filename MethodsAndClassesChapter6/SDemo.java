package javaBeginnersGuideProjects.MethodsAndClassesChapter6;
class StaticDemo{
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}
public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x are independent");
        System.out.println("ob.x: " + ob1. x + "\nob2.x" + ob2.x );
        System.out.println();

        System.out.println("The static variable y is shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
