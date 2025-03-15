import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class tensCPS extends JFrame {
	private JLabel timer;
	public static void main (String args[]) {
		Important selection = new Important();
		selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Timer t = new Timer();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
