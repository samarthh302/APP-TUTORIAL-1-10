package Week8;

// Tutorial2.java
/*
Scenario:
- User enters PIN in JPasswordField.
- If correct, buttons for Check Balance, Deposit, Withdraw appear.
*/

import javax.swing.*;
import java.awt.event.*;

public class Tutorial2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("ATM");
        JLabel l1 = new JLabel("Enter PIN:");
        JPasswordField pf = new JPasswordField();
        JButton login = new JButton("Login");
        JLabel msg = new JLabel();
        JButton checkBtn = new JButton("Check Balance");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");

        l1.setBounds(50,50,100,20);
        pf.setBounds(150,50,100,20);
        login.setBounds(50,80,100,30);
        msg.setBounds(50,120,200,20);
        checkBtn.setBounds(50,150,150,30);
        depositBtn.setBounds(50,190,150,30);
        withdrawBtn.setBounds(50,230,150,30);

        checkBtn.setVisible(false);
        depositBtn.setVisible(false);
        withdrawBtn.setVisible(false);

        f.add(l1); f.add(pf); f.add(login); f.add(msg);
        f.add(checkBtn); f.add(depositBtn); f.add(withdrawBtn);

        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // fix for 'local variable balance must be final or effectively final'
        final double[] balance = {50000};

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pin = new String(pf.getPassword());
                if(pin.equals("1234")) {
                    msg.setText("Login Successful!");
                    checkBtn.setVisible(true);
                    depositBtn.setVisible(true);
                    withdrawBtn.setVisible(true);
                } else {
                    msg.setText("Incorrect PIN!");
                }
            }
        });

        checkBtn.addActionListener(e -> 
            JOptionPane.showMessageDialog(f, "Balance: ₹" + balance[0])
        );
        depositBtn.addActionListener(e -> {
            String amt = JOptionPane.showInputDialog(f, "Enter deposit amount:");
            try {
                double dep = Double.parseDouble(amt);
                if(dep < 0) throw new NumberFormatException();
                balance[0] += dep;
                JOptionPane.showMessageDialog(f, "Deposited: ₹" + dep + "\nNew Balance: ₹" + balance[0]);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        withdrawBtn.addActionListener(e -> {
            String amt = JOptionPane.showInputDialog(f, "Enter withdraw amount:");
            try {
                double wd = Double.parseDouble(amt);
                if(wd < 0) throw new NumberFormatException();
                if(balance[0] >= wd) {
                    balance[0] -= wd;
                    JOptionPane.showMessageDialog(f, "Withdrawn: ₹" + wd + "\nNew Balance: ₹" + balance[0]);
                } else {
                    JOptionPane.showMessageDialog(f, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
