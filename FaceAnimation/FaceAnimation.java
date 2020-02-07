/*

 */
package faceanimation;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class FaceAnimation extends JFrame implements ActionListener
{
   private final int THREE_SECONDS = 3000;
   private final int FACE_DIAMETER = 200;
   private final int X_FACE = 100;
   private final int Y_FACE = 100;
   private final int EYE_WIDTH = 20;
   private final int EYE_HEIGHT = 10;
   private final int X_RIGHT_EYE = X_FACE + 35;
   private final int Y_RIGHT_EYE = Y_FACE + 60;
   private final int X_LEFT_EYE = X_FACE + 130;
   private final int Y_LEFT_EYE = X_FACE + 60;
   private final int MOUTH_WIDTH = 100; 
   private final int MOUTH_HEIGHT = 50;
   private final int X_MOUTH = X_FACE + 50;
   private final int Y_MOUTH = Y_FACE + 100;
   private final int MOUTH_START_ANGLE = 180;
   private final int MOUTH_ARC_SWEEP = 180;
   
   private boolean smile;

    
    public static void main(String args[]){
       FaceAnimation faceDraw = new FaceAnimation();
       faceDraw.setVisible(true);
   }
   
   private class Timer extends Thread
   {
         public void run(){
      
            while(true){
               try{
               Thread.sleep(THREE_SECONDS);
               repaint();
               }
               catch(InterruptedException e){
                  System.exit(0);
               }
            }
      
         }
   }
   
   public FaceAnimation(){
       super("Smile and Frown");
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       smile = true;
       setLayout(new BorderLayout());
       JButton b = new JButton("Start");
       b.addActionListener(this);
       add(b, BorderLayout.SOUTH);
       setTitle("Final Assignment!");
       
   }
   
   public void paint(Graphics g){
       super.paint(g);
       smile = !smile;
       g.setColor(Color.blue);
       g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
       g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
       g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
       
       
       if(smile){
           g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
       }
       else{
           g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE, -MOUTH_ARC_SWEEP);
       }
   }
   
   @Override
   public void actionPerformed(ActionEvent e){
       Timer timer = new Timer();
       timer.start();
   }
   

}

