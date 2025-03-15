import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main2 extends JFrame implements KeyListener {
	JTextField UpperCaseEverything;
	static int a = 1;
	static String CurrentlySelectedText;
	
	public Main2 () {
		super("Lower Cased Text");
		setLayout(new FlowLayout());
		
		UpperCaseEverything = new JTextField("Click caps lock to capitalize the text (you can change the text, and as aforementioned, if Caps Lock is off, everything will be lower cased).");
		CurrentlySelectedText = UpperCaseEverything.getText();
		
		UpperCaseEverything.addKeyListener(
				new KeyListener () {
					public void keyTyped(KeyEvent e) {
						
					}

					public void keyPressed(KeyEvent e) {
						String SelectedText = UpperCaseEverything.getText();
						
						if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK && a%2 == 1) {
							String UpperCaseText = SelectedText.toUpperCase();
							
							UpperCaseEverything.setText(UpperCaseText);
							a++;
						}
						
						else if (a%2 == 0) {
							String UpperCaseText = SelectedText.toLowerCase();
							
							UpperCaseEverything.setText(UpperCaseText);
							a++;
						}
					}

					public void keyReleased(KeyEvent e) {
						
					}
				}
				);
		
		add(UpperCaseEverything);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 250);
		setVisible(true);
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void keyPressed(KeyEvent e) {

		
	}

	public void keyReleased(KeyEvent e) {

		
	}
}
