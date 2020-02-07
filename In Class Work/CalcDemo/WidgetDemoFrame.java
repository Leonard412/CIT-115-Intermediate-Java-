import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Sample application using Frame.
 *
 * @author 
 * @version 1.00 07/04/18
 */
 import java.awt.event.*;
 
public class WidgetDemoFrame extends JFrame implements ActionListener{
     JTextField jb = new JTextField();    
     
    /**
     * The constructor.
     */  
     public WidgetDemoFrame() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuFileExit = new JMenuItem();
        Container c = getContentPane();
        c.setBackground(Color.YELLOW);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton clear = new JButton("C");
        JButton equals = new JButton("=");
        

        
        setLayout(new GridLayout(5,1));
        JPanel r1 = new JPanel();
        r1.setBackground(Color.RED);
        JPanel r2 = new JPanel();
        r2.setBackground(Color.WHITE);
        JPanel r3 = new JPanel();
        r3.setBackground(Color.BLUE);
        JPanel r4 = new JPanel();
        r4.setBackground(Color.YELLOW);
        JPanel r5 = new JPanel();
        r5.setBackground(Color.CYAN);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        r1.setLayout(new GridLayout(1,1));
        r1.add(jb);
        r2.setLayout(new GridLayout(1,4));
        r2.add(b1);
        r2.add(b2);
        r2.add(b3);
        r2.add(plus);
        r3.setLayout(new GridLayout(1,4));
        r3.add(b4);
        r3.add(b5);
        r3.add(b6);
        r3.add(minus);
        r4.setLayout(new GridLayout(1,4));
        r4.add(b7);
        r4.add(b8);
        r4.add(b9);
        r4.add(divide);
        r5.setLayout(new GridLayout(1,4));
        r5.add(clear);
        r5.add(b0);
        r5.add(equals);
        r5.add(multiply);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        clear.addActionListener(this);
        equals.addActionListener(this);
        minus.addActionListener(this);
        divide.addActionListener(this);
        
        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");
        
        // Add action listener.for the menu button
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    WidgetDemoFrame.this.windowClosed();
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("WidgetDemo");
        setJMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    WidgetDemoFrame.this.windowClosed();
                }
            }
        );  
    }
    
    public void actionPerformed(ActionEvent e){
    	String bs = e.getActionCommand();
    	if(bs.equals("1")){
    	   String x = jb.getText();
    	   jb.setText(x+"1");
    	}
    	if(bs.equals("2")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"2");
    	}
    	if(bs.equals("3")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"3");
    	}
      if(bs.equals("4")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"4");
    	}
      if(bs.equals("5")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"5");
    	}
      if(bs.equals("6")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"6");
    	}
      if(bs.equals("7")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"7");
    	}
      if(bs.equals("8")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"8");
    	}
      if(bs.equals("9")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"9");
    	}
      if(bs.equals("0")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"0");
    	}
      if(bs.equals("+")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"+");
    	}
      if(bs.equals("-")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"-");
    	}
      if(bs.equals("/")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"/");
    	}
      if(bs.equals("*")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"*");
    	}
      if(bs.equals("C")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"C");
    	}
      if(bs.equals("=")){
    	
    	   String x = jb.getText();
    	   jb.setText(x+"=");
    	}
    	
    }
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
    	
    	// TODO: Check if it is safe to close the application
    	
        // Exit application.
        System.exit(0);
    }
}
