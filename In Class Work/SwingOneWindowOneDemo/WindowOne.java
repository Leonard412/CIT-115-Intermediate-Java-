/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingonewindowonedemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowOne extends JFrame{
    private JPanel p;
    private final int MAX = 36;
    private JPanel[]pa = new JPanel[MAX-1];
    public WindowOne(){super();}
    public WindowOne(int w, int h){
        super();
        setVisible(true);
        setSize(w,h);
        setTitle("Color Processor");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton b = new JButton("Close");
        b.addActionListener(new EndWindowListener());
        p = new JPanel();
        for(int i = 0; i < MAX -1; i++){
            pa[i]= new JPanel();
        }
        p.setLayout(new GridLayout((int)Math.sqrt(MAX),(int)Math.sqrt(MAX)));
        add(p);
        p.add(b);
        for(int i = 0; i < MAX-1; i++){
            p.add(pa[i]);
        }
    }

    
    public void changeColor(){
        while(true){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){  
            }
            for(int i = 0; i < MAX-1; i++){
                pa[i].setBackground(new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),(int)(Math.random()*255.0)));
            }
        }
    }
    
}
