package Week8;
// Tutorial1.java
/*
Scenario:
- Users can select items using checkboxes.
- On clicking "Generate Bill", selected items and total price are displayed.
*/

import javax.swing.*;
import java.awt.event.*;

public class Tutorial1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Shopping Cart");
        JCheckBox cb1 = new JCheckBox("Laptop - 50000");
        JCheckBox cb2 = new JCheckBox("Phone - 20000");
        JCheckBox cb3 = new JCheckBox("Headphones - 2000");
        JButton billBtn = new JButton("Generate Bill");
        JTextArea ta = new JTextArea(5, 20);

        cb1.setBounds(50,50,150,20);
        cb2.setBounds(50,80,150,20);
        cb3.setBounds(50,110,150,20);
        billBtn.setBounds(50,150,150,30);
        ta.setBounds(50,200,250,100);

        f.add(cb1); f.add(cb2); f.add(cb3);
        f.add(billBtn); f.add(ta);

        f.setSize(350,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        billBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bill = "Selected Items:\n";
                int total = 0;
                if(cb1.isSelected()) { bill += "Laptop\n"; total += 50000; }
                if(cb2.isSelected()) { bill += "Phone\n"; total += 20000; }
                if(cb3.isSelected()) { bill += "Headphones\n"; total += 2000; }
                bill += "Total: " + total;
                ta.setText(bill);
            }
        });
    }
}
