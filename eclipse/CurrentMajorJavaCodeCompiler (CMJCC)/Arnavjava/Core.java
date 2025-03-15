import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Window;

public abstract class Core {
	private static DisplayMode modes[] = {
			new DisplayMode(1920, 1080, 32, 0),
			new DisplayMode(1920, 1080, 24, 0),
			new DisplayMode(1920, 1080, 16, 0)
	};
	private boolean running;
	protected Screen s;
	
	public void stop () {
		running = false;
	}
	
	public void run () {
		try {
			init();
			gameLoop();
		}
		finally {
			s.restoreScreen();
		}
	}
	public void init () {
		s = new Screen();
		
		DisplayMode dm = s.findFirstCompatibleList(modes);
		s.setFullScreen(dm);
		
		Window w = s.getFullScreenWindow();
		w.setFont(new Font("Arial", Font.PLAIN, 20));
		w.setBackground(Color.GREEN);
		w.setForeground(Color.WHITE);
		
		running = true;
	}
	
	public void gameLoop () {
		long startTime = System.currentTimeMillis();
		long cumTime = startTime;
		
		while (running) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			
			update(timePassed);
			
			Graphics2D g = s.getGraphics();
			draw(g);
			g.dispose();
			
			s.update();
			
			try {
				Thread.sleep(10);
			}
			catch (Exception e) {
				
			}
		}
	}
	
	public void update (long timePassed) {
		
	}
	
	public abstract void draw (Graphics2D g);
}