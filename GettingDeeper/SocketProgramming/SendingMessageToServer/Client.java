package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.SendingMessageToServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket socket = new Socket("localhost",5000);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String");
            String str = userInput.readLine();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(str);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
