package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTTPConnection {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.youtube.com/@wamique");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            for(int i=1; i<=8; i++){
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + " " +
                        httpURLConnection.getHeaderField(i));
            }

        }catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
