package javaBeginnersGuideProjects.MethodsAndClassesChapter6;
class MyClass2{
    int x;

    MyClass2(){
        System.out.println("Inside MyClass(). ");
        x = 0;
    }

    MyClass2(int i){
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    MyClass2(double d){
        System.out.println("Inside MyClass(double).");
    }
    MyClass2(int i, int j){
        System.out.println("Inside MyClass(int, int).");
    }
}
public class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass2 t1 = new MyClass2();
        MyClass2 t2 = new MyClass2(88);
        MyClass2 t3 = new MyClass2(17.23);
        MyClass2 t4 = new MyClass2(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
