package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.SingleThreadedChatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(555);

            // it will wait for both the sockets to appear and accept them
            Socket user1 = serverSocket.accept();
            Socket user2 = serverSocket.accept();

            System.out.println("Both the Users are ready.");

            // read from user 1
            BufferedReader user1Buffer = new BufferedReader(new InputStreamReader(user1.getInputStream()));
            // send to user 2
            PrintWriter user2Output = new PrintWriter(user2.getOutputStream(), true);

            // send the message from user1 to user2
            user2Output.println("User1: " + user1Buffer.readLine());

            // read from user 2
            BufferedReader user2Buffer = new BufferedReader(new InputStreamReader(user2.getInputStream()));
            // send to user 1
            PrintWriter user1Output = new PrintWriter(user1.getOutputStream(), true);

            // send the message from user2 to user1
            user1Output.println("User2: " + user2Buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
