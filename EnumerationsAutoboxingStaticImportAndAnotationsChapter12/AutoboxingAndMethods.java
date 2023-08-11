package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;

public class AutoboxingAndMethods {
    // This method has an Integer parameter
    static void m(Integer integerValue) {
        System.out.println("m() received " + integerValue);
    }

    // This method returns an int
    static int m2(){
        return 10;
    }

    // This method returns and Integer
    static Integer m3(){
        return 99; // autoboxing 99 into an Integer.
    }

    public static void main(String[] args) {
        // Pass an int to m(). Because m() has an Integer.
        // Parameter, the int value passed is automatically boxed.
        m(199);

        // Here, integer receives the int value returned by m2()
        // This value is automatically boxed so that it can be
        // assigned to integer
        Integer integer = m2();
        System.out.println("Return value from m2() is " + integer);

        // Next, m3() is called. It returns an Integer value
        // which is auto-unboxed into an int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Next, Math.sqrt() is called with integer as an argument.
        // In this case, integer is auto-unboxed and its value promoted to double
        // which is the type needed by sqrt().
        integer = 100;
        System.out.println("Square root of integer is " + Math.sqrt(integer));
    }


}
