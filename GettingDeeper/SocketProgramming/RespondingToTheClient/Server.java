package javaBeginnersGuideProjects.GettingDeeper.SocketProgramming.RespondingToTheClient;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.net.ServerSocket;
    import java.net.Socket;

    public class Server {
        public static void main(String[] args) {
            try{
                System.out.println("Waiting for the client.");
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket socket = serverSocket.accept();
                System.out.println("Connection Established");

                // reading the input of Socket means Client
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String str = in.readLine(); // reading line from the BufferedReader
                System.out.println("Client Says: " + str);

                // connecting with the output of Socket
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Server Says I received your " + str);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
