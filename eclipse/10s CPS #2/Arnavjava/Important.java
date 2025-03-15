import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Important extends JFrame {
	private String details;
	private JLabel click, Timer;
	public Important () {
	super("JFrame 1");

	click = new JLabel("Default");
	add(click, BorderLayout.NORTH);
	
	Clicked c = new Clicked();
	addMouseListener(c);
	
	setSize(100, 100);
	setVisible(true);
	}
	
	private class Clicked extends MouseAdapter {
		public void mouseClicked (MouseEvent event) {
		details = String.format("You've clicked %d %s ", event.getClickCount(), (event.getClickCount() == 1)? "time" : "times");
		
		click.setText(details);
		
		Thread t1 = new Thread(new Important());
		}
	}
}