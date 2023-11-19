package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.OneWay;
import java.io.*;
import java.net.*;
public class Server {
    // initialize socket, input and output
    private Socket socket = null;
    private DataInputStream input = null;
    private ServerSocket server = null;

    // constructor with port
    public Server(int port){
        try {
            // starts server and wait for a connection
            server = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting for a client...");

            socket = server.accept();
            System.out.println("Client accepted");

            // takes input from the client socket
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";

            // Reads message from client until over is sent
            while (!line.equals("Over")) {
                try {
                    line = input.readUTF();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Closing connection");

            socket.close();
            input.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
