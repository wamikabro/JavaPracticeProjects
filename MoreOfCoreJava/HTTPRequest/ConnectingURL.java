package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectingURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/");
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

    }
}
