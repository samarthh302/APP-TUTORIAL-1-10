package Week8;
// Tutorial4.java
/*
Scenario:
- Calculator with buttons 0-9, +, -, *, / and "=".
- Displays result in JTextField.
*/

import javax.swing.*;
import java.awt.event.*;

public class Tutorial4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        tf.setBounds(20,20,250,30);
        f.add(tf);

        String[] buttons = {"7","8","9","/","4","5","6","*","1","2","3","-","0","=","C","+"};
        JButton[] btn = new JButton[16];

        int x=20, y=60;
        for(int i=0;i<16;i++) {
            btn[i] = new JButton(buttons[i]);
            btn[i].setBounds(x,y,60,40);
            f.add(btn[i]);
            x+=70;
            if((i+1)%4==0){ x=20; y+=50; }
        }

        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final String[] op = {""};
        final double[] num1 = {0};
        final boolean[] isOpClicked = {false};

        for(JButton b: btn) {
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String text = b.getText();
                    if(text.equals("=")) {
                        double num2 = Double.parseDouble(tf.getText());
                        double res=0;
                        switch(op[0]){
                            case "+": res=num1[0]+num2; break;
                            case "-": res=num1[0]-num2; break;
                            case "*": res=num1[0]*num2; break;
                            case "/": res=num1[0]/num2; break;
                        }
                        tf.setText(""+res);
                        isOpClicked[0]=false;
                    } else if(text.equals("C")) {
                        tf.setText("");
                    } else if("+,-,*,/".contains(text)) {
                        num1[0] = Double.parseDouble(tf.getText());
                        op[0] = text;
                        isOpClicked[0]=true;
                        tf.setText("");
                    } else {
                        tf.setText(tf.getText()+text);
                    }
                }
            });
        }
    }
}

