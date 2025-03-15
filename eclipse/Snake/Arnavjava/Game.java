import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener, KeyListener {
	Timer t = new Timer(5, this);
	Graphics redBlob;
	int a = 60, b = 40, c = 20, d = 0, x = 80, j = 0, f = 0, i = 0, h = 0, y = 0, velX = 0, vel2X = 0, vel3X = 0, vel4X = 0, vel5X = 0, velY = 0, vel2Y = 0, vel3Y = 0, vel4Y = 0, vel5Y = 0;
	int repeat1 = 0;
	int enemyX = 1261, enemyY = 638;
	
	//Highest x value (as long as the entire object is on screen) on GUI is 1261, and highest y value is 638.
	
	public Game () {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.red);
		g.fillRect(enemyX, enemyY, 20, 20);
		
		g.setColor(Color.cyan);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.fill(new Rectangle.Double(x, y, 20, 20));
		g2.fill(new Rectangle.Double(a, j, 20, 20));
		g2.fill(new Rectangle.Double(b, f, 20, 20));
		g2.fill(new Rectangle.Double(c, i, 20, 20));
		g2.fill(new Rectangle.Double(d, h, 20, 20));
		
	}

	public void keyTyped(KeyEvent e) {

		
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		if (code == KeyEvent.VK_UP) {
			up();
			
		}
		
		if (code == KeyEvent.VK_DOWN) {
			down();
		}
		
		if (code == KeyEvent.VK_LEFT) {
			left();
		}
		
		if (code == KeyEvent.VK_RIGHT) {
			right();
		}
	}

	public void keyReleased(KeyEvent e) {

		
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		x += velX;
		a += vel2X;
		b += vel3X;
		c += vel4X;
		d += vel5X;
		y += velY;
		j += vel2Y;
		f += vel3Y;
		i += vel4Y;
		h += vel5Y;
	}
	
	public void up () {
		velX = 0;
		vel2X = 0;
		vel3X = 0;
		vel4X = 0;
		vel5X = 0;
		velY = -1;
	}
	
	public void down () {
		
		Thread t1 = new Thread(new Runnable () {

			public void run() {
				if (repeat1 == 0) {
					
					//Repeat a similar idea to what has been done in this if statement with methods up, right, and left.
					vel2Y = MoveRestDown(vel2Y);
					
					vel3Y = MoveRestDown(vel3Y);
					
					vel4Y = MoveRestDown(vel4Y);
					
					vel5Y = MoveRestDown(vel5Y);
					
					repeat1++;
				}
			}
		});
		t1.start();
		
		velX = 0;
		velY = 1;
	}
	
	public void left () {
		velX = -1;
		velY = 0;
	}
	
	public void right () {
		velX = 1;
		vel2X = 1;
		vel3X = 1;
		vel4X = 1;
		vel5X = 1;
		velY = 0;
	}
	
	public int MoveRestDown (int velnumY) {
				for (repeat1 = 0; repeat1<= 20; repeat1++) {
					try {
						Thread.sleep(5);
					} 
					catch (Exception e) {
						e.printStackTrace();
					}
					
					if (vel2Y == 0) {
					vel2X = 1;
					}
					
					if (vel3Y == 0) {
					vel3X = 1;
					}
					
					if (vel4Y == 0) {
					vel4X = 1;
					}
					
					if (vel5Y == 0) {
					vel5X = 1;
					}
				}
				vel2X = 0;
				vel3X = 0;
				vel4X = 0;
				vel5X = 0;
		
		return velnumY = 1;
		
	}
	}
	//Use: https://www.youtube.com/watch?v=p9Y-NBg8e to continue







