package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.SingleThreadedChatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User1 {
    public static void main(String[] args) {
        try {
            Socket userSocket = new Socket("localhost", 555);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message = userInput.readLine();

            // to send message to the server, so it can further send to the other user
            PrintWriter out = new PrintWriter(userSocket.getOutputStream(), true);
            out.println(message);

            // Read the response from other user
            BufferedReader response = new BufferedReader(new InputStreamReader(userSocket.getInputStream()));
            System.out.println(response.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
