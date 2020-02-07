/*
   Leonard Hawkes
   Assignment 12
 */
package fractal;

import javax.swing.*;
import java.awt.*;


public class FractalPanel extends JPanel {
 private String type;
	private Color foreground, background;

	public FractalPanel(String type, Color foreground, Color background)
	{
		super();
		this.type = type;
		this.foreground = foreground;
		this.background = background;
	}

	private static Coord mid(Coord a, Coord b)
	{
		return new Coord((a.x+b.x)/2, (a.y+b.y)/2);
	}

	private static Coord third(Coord a, Coord b)
	{
		return new Coord((b.x-a.x)/3+a.x, (b.y-a.y)/3+a.y);
	}

	private static double dist(Coord a, Coord b)
	{
		return Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2));
	}

	private static void drawSierpinski(Graphics2D g2, Coord a, Coord b, Coord c)
	{
		if (dist(a,b)<=2)  // if lines are only 2 pixels in length
		{
			g2.drawLine((int)a.x, (int)a.y, (int)b.x, (int)b.y);
			g2.drawLine((int)b.x, (int)b.y, (int)c.x, (int)c.y);
			g2.drawLine((int)c.x, (int)c.y, (int)a.x, (int)a.y);
		}
		else
		{
			drawSierpinski(g2, a, mid(a,b), mid(a,c));
			drawSierpinski(g2, mid(a,b), b, mid(b,c));
			drawSierpinski(g2, mid(a,c), mid(b,c), c);
		}
	}

	public void paintComponent(Graphics g)
	{
		double w = getSize().getWidth();
		double h = getSize().getHeight();

		g.setColor(background);
		g.fillRect(0, 0, (int)w, (int)h);
		g.setColor(foreground);
		Graphics2D g2 = (Graphics2D)g;

		if ("Sierpinski".equalsIgnoreCase(type))
		{
			drawSierpinski(g2, new Coord(0, h), new Coord(w/2.0, 0), new Coord(w, h));
		}
		else
		{
         System.out.println("Not Sierpinksi");
		}
	}
}

class Coord
{
	public double x, y;
	public Coord(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
}

class GraphWindow extends JFrame
{
	private Container c;
	public GraphWindow()
	{
		super("Fractal Maker");
		c = getContentPane();
		c.add(new FractalPanel("Sierpinski", Color.white, Color.darkGray));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,520);
	}
    
    
}
