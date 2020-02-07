/*
   Leonard Hawkes
   Assignment 12
 */
package fractal;

import javax.swing.*;
import java.awt.*;

public class Fractal extends JApplet {

public void init()
	{
		Container c = getContentPane();
		c.add(new FractalPanel("Sierpinski", Color.blue, Color.white));
	}

	public static void main(String [] args)
	{
		GraphWindow app = new GraphWindow();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frame = app.getSize();

		if (frame.height > screen.height) frame.height = screen.height;
		if (frame.width > screen.width) frame.width = screen.width;

		app.setLocation((screen.width - frame.width) / 2, (screen.height - frame.height) / 2);
		app.setVisible(true);
	}
}
