import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MRS extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JLabel l1,l2,l3,l4,l5;
    JButton b, reset;

    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/mrs";
    static final String uname = "root";
    static final String pw = "12345";

    public MRS(){
        l1=new JLabel("ID (numbers): ");
        l2=new JLabel("Title: ");
        l3=new JLabel("Genre: ");
        l4=new JLabel("Language: ");
        l5= new JLabel("Length (numbers in mins):");



        t1 = new JTextField(10);
        t2 = new JTextField(20);
        t3 = new JTextField(15);
        t4 = new JTextField(20);
        t5 = new JTextField(10);

        b = new JButton("OK");
        b.addActionListener(this);

        reset = new JButton("reset");
        reset.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,240,17));

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(l5);
        add(t5);

        add(b);
        add(reset);

        setTitle("INSERT TO MOVIE");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String title, gen, lang;
        int id, len;
        id = Integer.parseInt(t1.getText());
        title = t2.getText();
        gen = t3.getText();
        lang = t4.getText();
        len = Integer.parseInt(t5.getText());

//        final String driver = "com.mysql.cj.jdbc.Driver";
//        final String url = "jdbc:mysql://localhost:3306/mrs";
//        final String uname = "root";
//        final String pw = "12345";
        if (ae.getSource() == b) {
            Connection con = null;
            PreparedStatement stmt = null;
            try {
                //Register JDBC Driver
                Class.forName(driver);

                //Open a Connection
                System.out.println("Connecting to DataBase....");
                con = DriverManager.getConnection(url, uname, pw);

                //Execute a Query with Statement object
                System.out.println("Creating Statement...");

                String sql = "insert movie(id, Title, Genre, Language, Length) values (?, ?, ?, ?, ?)";
                stmt = con.prepareStatement(sql);

                stmt.setInt(1, id);
                stmt.setString(2, title);
                stmt.setString(3, gen);
                stmt.setString(4, lang);
                stmt.setInt(5, len);
                stmt.executeUpdate();
                System.out.println("done");
                //Clean up- close up
                stmt.close();
                con.close();

            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                System.out.println("this is in catch");
                e.printStackTrace();
            }
        }
        if(ae.getSource()==reset){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
    }
    public static void main(String []arg){
        new MRS();
    }
}
