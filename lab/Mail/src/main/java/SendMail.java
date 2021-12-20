import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import java.util.*;

public class SendMail extends Authenticator {
    static String from;
    static InternetAddress to;
    static String pass;
//    static String message;
    ;
    public static void main(String []arg) throws MessagingException{
        Scanner sc = new Scanner(System.in);
//        System.out.print("\nWrite your msg here");
//        message = sc.nextline();
        System.out.print("\nEnter you gmail: ");
        from=sc.nextLine();
        System.out.print("\nEnter the recipient:");
        String re=sc.nextLine();
        to=new InternetAddress((String)re);
//        Console con = System.console();
//        pass = new String(con.readPassword("\nEnter your password: "));
        System.out.print("\nEnter your password: ");
        pass = sc.nextLine();
        //Get session object
        Properties prop = System.getProperties();
        prop.put("mail.smtp.auth","true");
        prop.put("mail.smtp.starttls.enable","true"); //this starts TLS

        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port","587");
        prop.put("mail.smtp.user",from);
        prop.put("mail.smtp.password",pass);
        Session sess = Session.getDefaultInstance(prop);

        //compose the message
        MimeMessage msg = new MimeMessage(sess);
        msg.setFrom(from);
        msg.addRecipient(Message.RecipientType.TO,to);
        msg.setSubject("Test java Mail");
        msg.setContent("<h4>K xa gelal?</h4><br><br> sent from JAVA mail badri","text/html");
        Transport trans = sess.getTransport("smtp");
        trans.connect("smtp.gmail.com",from,pass);
        trans.sendMessage(msg,msg.getAllRecipients());
        System.out.println("Email sent successfully");
    }
}
