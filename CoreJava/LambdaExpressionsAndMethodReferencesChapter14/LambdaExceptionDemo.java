package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;

import java.io.IOException;
import java.io.Reader;

interface MyIOAction{
    boolean ioAction(Reader rdr) throws IOException;
}
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        MyIOAction myIO = rdr -> {
            int ch = rdr.read(); // could throw IOException
            return true;
        };
    }
}
