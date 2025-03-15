import javax.swing.JFrame;

public class Snake {
	public static void main (String args[]) {
		JFrame f = new JFrame("Snake");
		
		Game g = new Game();
		
		f.add(g);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 250);
		f.setVisible(true);
	}
}
