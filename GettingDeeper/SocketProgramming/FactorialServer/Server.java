package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.FactorialServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Waiting for the Client.");
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            // it will accept the client as soon as it gets one.
            // And it will store that in socket.
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int number = Integer.parseInt(bufferedReader.readLine());

            int factorial = 1;
            for(int i=1; i<number; i++, factorial=factorial*i);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(factorial);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
