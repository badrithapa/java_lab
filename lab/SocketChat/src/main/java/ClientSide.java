import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ClientSide {
    public static void main(String []args) throws IOException {
        System.out.println("Sending connection request.......");
        Socket cs = new Socket("localhost", 1255);
        //to communicate between two diffence device on same network or wifi simply replace "locahost" with servers IP address and you're done.
        Scanner socketin = new Scanner(cs.getInputStream());
        PrintWriter socketout = new PrintWriter(cs.getOutputStream(),true);

        System.out.println(".....Connection Established");

        Scanner console = new Scanner(System.in);

        String clientmsg, servermsg;
        do {
            servermsg = socketin.nextLine();
            System.out.println("\nServer: "+servermsg);
            System.out.print("\nClient: ");
            clientmsg = console.nextLine();
            socketout.println(clientmsg);
        }while(!servermsg.contains("bye"));
        System.out.println("Leaving chat.....");
        socketout.close();
        socketin.close();
        console.close();
        cs.close();
    }
}
