import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame implements KeyListener {
	JTextField UpperCaseEverything;
	static int a = 1;
	static String CurrentlySelectedText;
	static String[] StringCurrentlySelectedText;
	
	public Main () {
		super("Original Text");
		
		UpperCaseEverything = new JTextField("Click caps lock to capitalize the text (you can change the text, and as aforementioned, if Caps Lock is off, it will get your previous text before it was capitalized).");
		CurrentlySelectedText = UpperCaseEverything.getText();
		
		UpperCaseEverything.addKeyListener(
				new KeyListener () {
					public void keyTyped(KeyEvent e) {
						
					}

					public void keyPressed(KeyEvent e) {
						
						if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK && a%2 == 1) {
							String SelectedText = UpperCaseEverything.getText();
							String UpperCaseText = SelectedText.toUpperCase();
							
							UpperCaseEverything.setText(UpperCaseText);
							a++;
						}
						
						else if (e.getKeyCode() != KeyEvent.VK_CAPS_LOCK) {
							CurrentlySelectedText = UpperCaseEverything.getText();
						}
						
						else if (a%2 == 0) {
							UpperCaseEverything.setText(CurrentlySelectedText);
							a++;
						}
					}

					public void keyReleased(KeyEvent e) {
						
					}
				}
				);
		
		add(UpperCaseEverything, BorderLayout.NORTH);
		
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
