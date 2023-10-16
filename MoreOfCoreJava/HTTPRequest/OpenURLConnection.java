package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class OpenURLConnection {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.youtube.com/@wamique");

            URLConnection urlConnection = url.openConnection();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Name: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        }catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
