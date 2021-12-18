import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;


public class GuiPalindrome extends JFrame implements ActionListener
{
    JLabel label,out;
    JTextField t;
    JButton b1, b2, b3;
    JPanel buttons;
    public GuiPalindrome()
    {
        setTitle("Check Palindrome");
        setSize(800,400);

        label = new JLabel("Input any String:");
        t = new JTextField(20);
        out = new JLabel("output");
        b1= new JButton("CheckPalindrome");
        b2 = new JButton("Reverse");
        b3=new JButton("FindVowels");
        setLayout(new BorderLayout());

        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,5,50));
        p1.add(label);
        p1.add(t);
        add(p1, BorderLayout.NORTH);

        JPanel p2 =  new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        p2.add(out);
        add(p2,BorderLayout.CENTER);

        buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER,10,95));
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        add(buttons,BorderLayout.SOUTH);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);

//        setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        gbc.ipadx=5;
//        gbc.ipady=5;
//        gbc.gridwidth=1;
//        gbc.fill=GridBagConstraints.BOTH;
//
//
//        gbc.gridx=0;
//        gbc.gridy=0;
//        add(label,gbc);
//
//        gbc.gridy=0;
//        gbc.gridx=1;
//        gbc.gridwidth=3;
//        add(t,gbc);
//
//        gbc.gridx=0;
//        gbc.gridy=1;
//        gbc.ipady=40;
//        gbc.ipadx=100;
//        add(out,gbc);
//
//        gbc.gridx=0;
//        gbc.gridy=2;
//        gbc.ipadx=10;
//        gbc.ipady=15;
//        gbc.gridwidth=1;
//        add(b1,gbc);
//
//        gbc.gridx=1;
//        gbc.gridy=2;
//        gbc.ipadx=10;
//        gbc.ipady=15;
//        gbc.gridwidth=1;
//        add(b2,gbc);
//
//        gbc.gridx=2;
//        gbc.gridy=2;
//        gbc.ipadx=10;
//        gbc.ipady=15;
//        gbc.gridwidth=1;
//        add(b3,gbc);

    }
    public void actionPerformed(ActionEvent e)
    {
        String x=t.getText();
        StringBuilder str = new StringBuilder();
        str.append(x);
        String text = String.valueOf(str);
        str.reverse();
        String rev= String.valueOf(str);

        if(e.getActionCommand()=="CheckPalindrome")
        {
            if(x.isEmpty())
            {
                out.setText("Please enter a string First:");
            }
            else if(x.equalsIgnoreCase(rev))
            {
                out.setText("It is a Palindrome: \n\t"+text+" ==> "+rev);
            }
            else
            {
                out.setText("Not they are not palindrome: \n\t"+text+" doesn't = "+rev);
            }
        }
        if(e.getActionCommand()=="Reverse")
        {
            if(x.isEmpty())
            {
                out.setText("Enter a string First");
            }
            else
            {
                out.setText("The Reverse of "+x+" is: "+rev);
            }
        }
        if(e.getActionCommand()=="FindVowels")
        {
            char[] vowel ={'a','e','i','o','u'};
            out.setText("");
            if(x.isEmpty()) {
                out.setText("Enter a string First");
            }
            else {
                out.setText("The Vowels are: ");
                for (char i : vowel) {
                    if (x.indexOf(i) != -1) {
                        out.setText(out.getText() + i + ", ");
                    }
                }
            }
        }
    }

    public static void main(String [] args)
    {
        new GuiPalindrome();
    }
}
