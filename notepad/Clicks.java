import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Clicks {
	public static void main (String args[]) {
	ME selection = new ME();
	selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	selection.setSize(1000, 1000);
	selection.setVisible(true);
}
}

class ME extends JFrame {
	private String details;
	private JLabel SB;
	public ME () {
	super("Title");
	setLayout(new FlowLayout());

	SB = new JLabel("Default");
	add(SB);
	addMouseListener(new Mouseclass());
}
	private class Mouseclass extends MouseAdapter {
	public void mouseClicked (MouseEvent event) {
	details = String.format("You've clicked %d %s ", event.getClickCount(), (event.getClickCount() == 1)? "time" : "times");

	SB.setText(details);
}
}
}