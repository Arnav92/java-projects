import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.Event;

public class Important extends JFrame {
	private String details;
	static String timer3;
	private JLabel click;
	private static JLabel timer;
	static int a = 1, timer2;
	protected static int getClickCount;
	static boolean running;
	public Important () {
	super("Title");
	
	running = true;

	click = new JLabel("Default");
	add(click, BorderLayout.NORTH);
	
	timer = new JLabel("Default");
	add(timer, BorderLayout.SOUTH);

	addMouseListener(new Clicked());
	
	setSize(500, 500);
	setVisible(true);
	}
	
	private class Clicked extends MouseAdapter {
		public void mouseClicked (MouseEvent event) {
		details = String.format("You've clicked %d %s ", event.getClickCount(), (event.getClickCount() == 1)? "time" : "times");
		
		click.setText(details);
		
		getClickCount = event.getClickCount();
		
		if (event.getClickCount() == 1) {
		Timer();
		}
		}
	}
	
	public void startTimer () {
		Timer();
	}
	
		public static void Timer () {
			if (a == 1) {
			Thread t1 = new Thread (new Runnable() {
				public void run () {
					for (timer2 = 10; timer2 >= 0; timer2--) {
						timer3 = Integer.toString(timer2);
						
						timer.setText(timer3);
						
						if (timer2 == 0) {
							runCC();
						}
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						a++;
					}
				}
			}
					);
			
			t1.start();
			}	
	}
		
		public static final void runCC () {
			ClickCount CC = new ClickCount();
			
			CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}