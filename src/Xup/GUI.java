package Xup;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    GUI(){
        ImageIcon icon = new ImageIcon("log1.jpg");
        button = new JButton();
        button.setBounds(200,100,200,150);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setText("Trigger");
        button.setBorder(BorderFactory.createEtchedBorder());

        label = new JLabel("Yo");
        label.setVisible(false);
        label.setBounds(200,500,25,20);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            label.setVisible(true);


        }
    }

}
