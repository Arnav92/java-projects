import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserBoi {
	public static void main (String args[]) {
	JColorss f = new JColorss();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(150, 150);
	f.setVisible(true);
}
}

class JColorss extends JFrame {
	private JButton b;
	private Color c = (Color.WHITE);
	private JPanel JP;

	public JColorss () {
	super("Choose your Color");

	JP = new JPanel();
	JP.setBackground(c);

	b = new JButton("Pick a color");
	b.addActionListener (
	new ActionListener () {
	public void actionPerformed (ActionEvent event) {
	c = JColorChooser.showDialog(null, "Pick a color", c);
	
	if (c == null) {
	c = (Color.WHITE);
}
	JP.setBackground(c);
}
}
);
	add(JP, BorderLayout.CENTER);
	add(b, BorderLayout.NORTH);
}
}