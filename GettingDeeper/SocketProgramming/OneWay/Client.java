package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.OneWay;
import java.io.*;
import java.net.*;
public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    // constructor that take IP and Port
    Client(String address, int port){
        // establish a connection
        try{
            socket = new Socket(address, port);
            System.out.println("Connected");

            // takes input from terminal
            input = new DataInputStream(System.in);

            // sends output to the socket
            output = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println("Unknown host: " + u.getMessage());
        } catch (ConnectException c) {
            System.out.println("Connection refused. Make sure the server is running.");
        } catch (IOException i) {
            System.out.println("IO error: " + i.getMessage());
        }


        // string to read the message from input
        String line = "";

        // keep reading until "Over" is input
        while(!line.equals("Over")){
            try{
                line = input.readLine();
                output.writeUTF(line);
            }
            catch (IOException e){
                System.out.println(e);
            }
        }

        // close the connection
        try{
            input.close();
            output.close();
            socket.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
