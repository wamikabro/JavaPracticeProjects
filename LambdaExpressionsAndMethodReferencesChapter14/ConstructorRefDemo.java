package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
// Demonstrate a Constructor reference.

// MyFunc2 is a functional interface whose method returns
// a myclass reference
interface MyFunc2{
    MyClass func(String s);
}

class MyClass{
    private String str;

    // This constructor takes an argument
    MyClass(String s) {
        str = s;
    }

    // This is the default constructor
    MyClass(){
        str = "";
    }

    String getStr(){
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass::new;

        MyClass mc = myClassCons.func("Testing");

        System.out.println("str in mc is " + mc.getStr());
    }
}
