package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;
// An example that uses @Deprecated.

import static java.lang.System.*;

// We'll deprecate this class
public class DeprecatedClass {
    private String message;

    DeprecatedClass(String message){
        this.message = message;
    }

    // Deprecate a method within a class.
    @Deprecated
    String getMessage(){
        return message;
    }

}

class Annotations{
    public static void main(String[] args) {
        DeprecatedClass deprecatedClass = new DeprecatedClass("test");

        out.println(deprecatedClass.getMessage());
    }
}