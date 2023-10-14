package javaBeginnersGuideProjects.MoreOfCoreJava.HTTPRequest;

import java.net.MalformedURLException;
import java.net.URL;

public class FetchingURLData {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/search?q=wamique&sca_esv=573208298&sxsrf=AM9HkKlacYxR2DKZ_SqRHNMQTJk_RbFaew%3A1697208043287&source=hp&ei=61YpZcDrDsurxc8PtOum-AM&iflsig=AO6bgOgAAAAAZSlk-0ZHxdI_oBwSpNznQHmELFN-evsS&ved=0ahUKEwiAjZzUoPOBAxXLVfEDHbS1CT8Q4dUDCAo&uact=5&oq=wamique&gs_lp=Egdnd3Mtd2l6Igd3YW1pcXVlMg0QLhiDARixAxiKBRhDMgQQLhgDMgsQABiABBixAxiDATILEC4YgAQYxwEYrwEyBRAAGIAEMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyBRAAGIAEMgUQABiABDILEAAYgAQYsQMYgwFIwgpQtwRY5glwAXgAkAEAmAGrAqABigqqAQMyLTW4AQPIAQD4AQGoAgrCAgcQIxjqAhgnwgIOEC4YigUYsQMYgwEY1ALCAggQABiABBixA8ICCxAAGIoFGLEDGIMBwgITEC4YigUYsQMYgwEYxwEY0QMYQ8ICBxAAGIoFGEPCAgcQLhiKBRhDwgINEC4YigUYxwEY0QMYQ8ICChAAGIoFGLEDGEPCAg0QLhiKBRixAxiDARhD&sclient=gws-wiz");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Name: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
            System.out.println("Query Name: " + url.getQuery());
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}
