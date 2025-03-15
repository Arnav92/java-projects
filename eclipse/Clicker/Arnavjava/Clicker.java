import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clicker {
	public static void main (String args[]) {
	ME selection = new ME();
	selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	selection.setSize(1000, 1000);
	selection.setVisible(true);
}
}

class ME extends JFrame {
	private String details, TimePopUp, TimeisUp;
	private JButton SB;
	private JLabel JPopUp;
	public ME () {
	super("Title");

	SB = new JButton("Default");
	add(SB, BorderLayout.NORTH);
	
	JPopUp = new JLabel("Default Timer Position");
	add(JPopUp, BorderLayout.SOUTH);

	SB.addMouseListener(new Mouseclass());
	JPopUp.addMouseListener(new Mouseclass());
}

	private class Mouseclass extends MouseAdapter {
	public void mouseClicked (MouseEvent event) {
	details = String.format("You've clicked %d %s ", event.getClickCount(), (event.getClickCount() == 1)? "time" : "times");
	SB.setText(details);
	
	if (event.getClickCount() >= 1 && event.getSource() == SB) {
		for (int a = 10; a >= 1; a--) {
			TimePopUp = String.format("%d", a);
			JPopUp.setText(TimePopUp);
			try {
				Thread.sleep(1000); 
				if (a == 1) {
					TimeisUp = String.format("Time is up!!");
					JPopUp.setText(TimeisUp);
				}
				}
				catch (InterruptedException ie){
				Thread.currentThread().interrupt();
				}
	}
}
}
}
}