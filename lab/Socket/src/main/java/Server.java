import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
    public static void main(String []args) throws IOException{
        //Register Services on port 1254
        ServerSocket ss = new ServerSocket(1254);
        //wait for client request to connect
        Socket cs = ss.accept();

        //Get a communication stram associated with the socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream());
        //Perform I/O


    }
}
