package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadInputStream {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.youtube.com/@wamique");

            URLConnection urlConnection = url.openConnection();

            InputStream stream = urlConnection.getInputStream();

            int i;
            while((i=stream.read())!=-1){
                System.out.print((char) i);
            }

        }catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
