import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingsforFun {
	public static void main (String args[]) {
	JFrame f = new JFrame("Shapes & Text");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Peach b = new Peach();
	f.add(b);
	f.setSize(150, 150);
	f.setVisible(true);
}
}

class Peach extends JPanel {
	
	public void paintComponent (Graphics g) {
	super.paintComponent(g);
	this.setBackground(Color.BLACK);

	g.setColor(Color.ORANGE);
	g.drawLine(100, 250, 1000, 420);

	g.setColor(Color.PINK);
	g.fillRect(500, 15, 100, 100);

	g.setColor(Color.GREEN);
	g.drawOval(10, 43, 100, 100);

	g.setColor(Color.WHITE);
	g.fill3DRect(342, 200, 396, 56, true);

	Graphics2D g2d = (Graphics2D)g;
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
}
}