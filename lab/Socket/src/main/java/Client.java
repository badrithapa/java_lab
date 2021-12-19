import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String []args) throws IOException {
        //open connection to server with port
        Socket cs = new Socket("localhost", 1254);

        //Get input and output stream
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true); //this true autoflushes the output stream

        //Perform IO
        outs.println("Hello Server");
        String s=ins.nextLine();
        System.out.println("From Server: "+s);
        //close streams and connection
        ins.close();
        outs.close();
        cs.close();
    }
}
