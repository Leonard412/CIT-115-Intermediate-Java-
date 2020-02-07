/**
 * @(#)AFrame.java
 *
 *
 * @author Ken Moore
 * @version 1.00 2013/4/1
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AFrame extends JFrame implements ActionListener{
        
    // a couple of buttons to be added.    
	JButton endButton = new JButton("exit");
	JButton testButton = new JButton("test");
    public AFrame() {

		// recommended
    	super();
    	
		// default behavior is visible = false;
    	setVisible(true);
    	
    	// default size = icon
    	setSize(300,300);
    	
    	// 1 row 2 columns
    	setLayout(new GridLayout(1,2));
    	
    	// close the program when the window is exited.
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	// add the buttons to the JFrame
    	add(endButton);
    	add(testButton);
    	
    	// register the buttons with the ActionListener
    	endButton.addActionListener(this);
    	testButton.addActionListener(this);
    }
    
    // this method is where you put the code that responds to
    // the event.  Try deleting this method and look at the 
    // error message.
	public void actionPerformed(ActionEvent e){
		
		// see all the information e contains.
		System.out.println("In actionPerformed " + e);
		
		// using the getActionCommand method, match to button text
		if(e.getActionCommand().equals("exit")){
			System.out.println("exit pressed");
			System.exit(1);
		}
		
		// using the getSource method, match to the component
		else if(e.getSource() == testButton)
			System.out.println("test pressed");
			
	}

    public static void main(String[] args) {
    	
    	// instantiate the window
        AFrame af = new AFrame();
        
        // set a title (this could be done in the constructor
        af.setTitle("Simple Test Frame");
        
    }
}
