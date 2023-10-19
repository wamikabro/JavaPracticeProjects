package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DisconnectConnection {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.youtube.com/@wamique");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            for(int i=1; i<=8; i++){
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + " " +
                        httpURLConnection.getHeaderField(i));
            }

            httpURLConnection.disconnect();

        }catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
