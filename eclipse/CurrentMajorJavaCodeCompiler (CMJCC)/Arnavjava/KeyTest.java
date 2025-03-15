import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest extends Core implements KeyListener {
	private String message = "";
	public KeyTest () {
		new KeyTest().run();
	}
	
	public void init () {
		super.init();
		
		Window w = s.getFullScreenWindow();
		w.setFocusTraversalKeysEnabled(false);
		w.addKeyListener(this);
		
		message = "press escape key to exit";
	}
	
	public void keyPressed (KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_ESCAPE) {
			stop();
		}
		else {
			message = "Pressed : " +KeyEvent.getKeyText(keyCode);
			
			e.consume();
		}
	}
	
	public void keyReleased (KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		message = "Released : " +KeyEvent.getKeyText(keyCode);
		
		e.consume();
	}
	
	public void keyTyped (KeyEvent e) {
		e.consume();
	}
	
	public synchronized void draw (Graphics2D g) {
		Window w = s.getFullScreenWindow();
		
		g.setColor(w.getBackground());
		g.fillRect(0, 0, s.getWidth(), s.getHeight());
		g.setColor(w.getForeground());
		g.drawString(message, 30, 30);
	}
}