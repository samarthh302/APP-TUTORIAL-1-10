package Week8;

// Tutorial3.java
/*
Scenario:
- Form collects employee details.
- On submission, adds to JTable and displays all employees.
*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Tutorial3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Employee Management");
        JLabel l1 = new JLabel("Name"), l2 = new JLabel("Department"), l3 = new JLabel("Salary");
        JTextField t1 = new JTextField(), t2 = new JTextField(), t3 = new JTextField();
        JButton add = new JButton("Add Employee");

        l1.setBounds(20,20,80,20); t1.setBounds(100,20,120,20);
        l2.setBounds(20,50,80,20); t2.setBounds(100,50,120,20);
        l3.setBounds(20,80,80,20); t3.setBounds(100,80,120,20);
        add.setBounds(100,110,120,30);

        String[] columns = {"Name","Department","Salary"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20,150,300,150);

        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sp);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{t1.getText(), t2.getText(), t3.getText()});
                t1.setText(""); t2.setText(""); t3.setText("");
            }
        });
    }
}

