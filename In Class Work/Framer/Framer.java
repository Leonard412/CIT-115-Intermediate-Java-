/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package framer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Framer extends JFrame implements ActionListener {
    
    JButton endButton = new JButton("exit");
    JButton testButton = new JButton("test");
    JButton one = new JButton("1");

public Framer(){
    super();
    setVisible(true);
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(1,2));
    add(endButton, BorderLayout.SOUTH);
    add(testButton);
    add(one);
    endButton.addActionListener(this);
    testButton.addActionListener(this);
    one.addActionListener(this);
}
    public static void main(String[] args) {
        Framer f = new Framer();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("exit")){
            System.out.println("Exit was pressed");
            System.exit(1);
        }
        if(e.getActionCommand().equals("test")){
            System.out.println("Test was pressed");
        }
        if(e.getActionCommand().equals("1")){
            System.out.println("One was pressed");
            }
      
    }
    
}
