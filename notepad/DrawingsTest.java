import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingsTest {
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
	this.setBackground(Color.WHITE);

	g.setColor(Color.BLUE);
	g.fillRect(25, 25, 100, 30);

	g.setColor(new Color(190, 81, 255));
	g.fillRect(50, 65, 160, 20);

	g.setColor(Color.PINK);
	g.drawString("Cool Squares Boi", 130, 105);
}
}