import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SI extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JButton b;
    public SI(){
        l1=new JLabel("Principal: ");
        l2=new JLabel("Time (in years): ");
        l3=new JLabel("Rate: ");
        l4= new JLabel("Simple Interest:");


        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t4.setEditable(false);  //cannot edit or input in output text-field.

        b = new JButton("Calculate");
        b.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,140,15));

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(b);

        setTitle("Interest Calculator");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        float p,t,r;
        p = Float.parseFloat(t1.getText());
        t=Float.parseFloat(t2.getText());
        r=Float.parseFloat(t3.getText());

        float si = (p*t*r)/100;

//        t4.setText(String.format("%.3f",si));
        t4.setText(String.valueOf(si));
    }
    public static void main(String []arg){
        new SI();
    }
}
