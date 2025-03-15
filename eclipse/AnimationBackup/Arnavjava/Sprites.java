import java.awt.Image;

public class Sprites {
	private Animation2 a2;
	private float x;
	private float y;
	private float vx;
	private float vy;
	
	public Sprites (Animation2 a2) {
		this.a2 = a2;
	}
	
	public void update (long timePassed) {
		x += vx * timePassed;
		y += vy * timePassed;
		
		a2.update(timePassed);
	}
	
	public float getX () {
		return x;
	}
	
	public float getY () {
		return y;
	}
	
	public void setX (float x) {
		this.x = x;
	}
	
	public void setY (float y) {
		this.y = y;
	}
	
	public int getWidth () {
		return a2.getImage().getWidth(null);
	}
	
	public int getHeight () {
		return a2.getImage().getHeight(null);
	}
	
	public float getVelocityX () {
		return vx;
	}
	
	public float getVelocityY () {
		return vy;
	}
	
	public void setVelocityX (float vx) {
		this.vx = vx;
	}
	
	public void setVelocityY (float vy) {
		this.vy = vy;
	}
	
	public Image getImage () {
		return a2.getImage();
	}
}






























