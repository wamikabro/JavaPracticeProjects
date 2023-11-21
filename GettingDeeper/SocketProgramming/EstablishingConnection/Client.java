package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.EstablishingConnection;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket socket = new Socket("localhost",5000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
