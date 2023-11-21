package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.EstablishingConnection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for the client.");
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
