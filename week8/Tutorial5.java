package Week8;

// Tutorial5.java
/*
Scenario:
- User rates service (1-5 stars) using radio buttons and enters comments in JTextArea.
- On clicking Submit, shows a thank-you message.
*/

import javax.swing.*;
import java.awt.event.*;

public class Tutorial5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Feedback Form");

        JLabel l1 = new JLabel("Rate our service:");
        l1.setBounds(20,20,150,20);
        f.add(l1);

        JRadioButton r1 = new JRadioButton("1"); 
        JRadioButton r2 = new JRadioButton("2");
        JRadioButton r3 = new JRadioButton("3");
        JRadioButton r4 = new JRadioButton("4");
        JRadioButton r5 = new JRadioButton("5");

        r1.setBounds(20,50,50,20); r2.setBounds(70,50,50,20);
        r3.setBounds(120,50,50,20); r4.setBounds(170,50,50,20);
        r5.setBounds(220,50,50,20);

        f.add(r1); f.add(r2); f.add(r3); f.add(r4); f.add(r5);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2); bg.add(r3); bg.add(r4); bg.add(r5);

        JLabel l2 = new JLabel("Your comments:");
        l2.setBounds(20,90,150,20);
        f.add(l2);

        JTextArea ta = new JTextArea();
        ta.setBounds(20,120,250,80);
        f.add(ta);

        JButton submit = new JButton("Submit");
        submit.setBounds(100,220,100,30);
        f.add(submit);

        f.setSize(320,320);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rating = "";
                if(r1.isSelected()) rating = "1";
                else if(r2.isSelected()) rating = "2";
                else if(r3.isSelected()) rating = "3";
                else if(r4.isSelected()) rating = "4";
                else if(r5.isSelected()) rating = "5";
                else rating = "No rating";

                String comments = ta.getText();

                JOptionPane.showMessageDialog(f, "Thank you for your feedback!\nRating: " + rating + "\nComments: " + comments);
            }
        });
    }
}
