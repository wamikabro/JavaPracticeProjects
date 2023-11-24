package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.FactorialServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client Started.");
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader readNumber = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(readNumber.readLine());

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(number);

            BufferedReader readFactorial = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Factorial: " + readFactorial.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
