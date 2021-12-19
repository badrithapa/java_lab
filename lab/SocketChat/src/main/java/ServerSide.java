import java.io.*;
import java.net.*;
import java.util.*;

public class ServerSide {
    public static void main(String []args) throws IOException{
        ServerSocket ss = new ServerSocket(1255);
        System.out.println("Waiting for Client.....");
        //wait for client to connect
        Socket cs = ss.accept();
        Scanner socketin = new Scanner(cs.getInputStream());//socket stream
        PrintWriter socketout = new PrintWriter(cs.getOutputStream(),true);//socket stream
        System.out.println("....Connection Established");
        Scanner console = new Scanner(System.in); //to take input from console

        String clientmsg , servermsg;
        do{
            System.out.print("\nServer: ");
            servermsg = console.nextLine();
            socketout.println(servermsg);

            clientmsg = (String)socketin.nextLine();
            System.out.println("\nClient: "+clientmsg);
        }while(!clientmsg.contains("bye"));
        System.out.println(".....Client Left the chat....");
        socketout.close();
        socketin.close();
        console.close();
        cs.close();
    }
}
