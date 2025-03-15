import java.awt.Image;
import java.util.ArrayList;

public class Animation2 {
	private ArrayList scene;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;
	
	public Animation2 () {
		scene = new ArrayList();
		totalTime = 0;
		
		start();
	}
	
	public synchronized void addScene (Image i, long t) {
		totalTime += t;
		
		scene.add(new OneScene(i, totalTime));
	}
	
	public synchronized void start () {
		movieTime = 0;
		sceneIndex = 0;
	}
	public synchronized void update (long timePassed) {
		if (scene.size() > 1) {
			movieTime += timePassed;
		}
		if (movieTime >= totalTime) {
			movieTime = 0;
			sceneIndex = 0;
		}
		while (movieTime > getScene(sceneIndex).endTime) {
			sceneIndex++;
		}
	}
	
	public synchronized Image getImage () {
		if (scene.size() == 0) {
			return null;
		}
		else {
			return getScene(sceneIndex).pic;
		}
	}
	
	private OneScene getScene (int x) {
		return (OneScene) scene.get(x);
	}
	
	private class OneScene {
		Image pic;
		long endTime;
		
		public OneScene (Image pic, long endTime) {
			this.pic = pic;
			this.endTime = endTime;
		}
	}
}