import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Animation {
	private Animation2 a2;
	private Sprites sprite;
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
		
		a2.addScene(face1, 100);
		a2.addScene(face2, 100);
		
		sprite = new Sprites(a2);
		
		sprite.setVelocityX(0.3f);
		sprite.setVelocityY(0.0f);
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
			
			update(timePassed);
			
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
		g.drawImage(sprite.getImage(), Math.round(sprite.getX()), Math.round(sprite.getY()), null);
	}
	
	public void update (long timePassed) {
		if (sprite.getX() < 0) {
			sprite.setVelocityX(Math.abs(sprite.getVelocityX()));
		}
		else if (sprite.getX() + sprite.getWidth() >= s.getWidth()) {
			sprite.setVelocityX(-Math.abs(sprite.getVelocityX()));
		}
	
	if (sprite.getY() < 0) {
		sprite.setVelocityY(Math.abs(sprite.getVelocityY()));
	}
	else if (sprite.getY() + sprite.getHeight() >= s.getHeight()) {
		sprite.setVelocityY(-Math.abs(sprite.getVelocityY()));
	}
	
	sprite.update(timePassed);
	}
	}