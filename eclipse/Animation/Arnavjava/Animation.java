import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Animation {
	private Animation2 a2;
	private Screen s;
	private Image bg;
	
	public static void main (String args[]) {
		Animation a = new Animation();
		
		a.run();
		}
	
	public static final DisplayMode modes1[] = {
		new DisplayMode(1920, 1080, 32, 0),
		new DisplayMode(1920, 1080, 24, 0),
		new DisplayMode(1920, 1080, 16, 0)
	};
	
	public void loadImages () {
		bg = new ImageIcon("C:\\Arnavjava\\a.png").getImage();
		
		Image face1 = new ImageIcon("C:\\Arnavjava\\a.png").getImage();
		Image face2 = new ImageIcon("C:\\Arnavjava\\b.png").getImage();
		
		a2 = new Animation2();
		
		a2.addScene(face1, 250);
		a2.addScene(face2, 250);
	}
	
	public void run () {
		s = new Screen();
		
		try {
			DisplayMode dm = s.findFirstCompatibleList(modes1);
			
			s.setFullScreen(dm);
			loadImages();
			movieLoop();
		}
		finally {
			s.restoreScreen();
		}
	}
	
	public void movieLoop () {
		long startingTime = System.currentTimeMillis();
		long accumulativeTime = startingTime;
		
		while (accumulativeTime - startingTime < 6000) {
			long timePassed = System.currentTimeMillis() - accumulativeTime;
			
			accumulativeTime += timePassed;
			
			a2.update(timePassed);
			
			Graphics2D g = s.getGraphics();
			draw(g);
			g.dispose();
			s.update();
			
			try {
				Thread.sleep(1);
			}
			catch (Exception e) {
				
			}
		}
	}
	
	public void draw (Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a2.getImage(), 0, 0, null);
	}
	}