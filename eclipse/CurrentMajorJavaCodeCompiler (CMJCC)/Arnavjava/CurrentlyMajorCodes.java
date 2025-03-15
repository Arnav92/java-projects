import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CurrentlyMajorCodes extends JFrame {
	private JButton ClickSpeedTest, WeirdAnimation, PongBallMovementKinda, StartInstantMessanger;
	private tensCPS TCPS;
	private Animation a = new Animation();
	private Animation3 a3 = new Animation3();
	private StartInstantMessanger SIM = new StartInstantMessanger();;
	
	
	public CurrentlyMajorCodes () {
		super("Major Code Compiler");
		setLayout(new FlowLayout());
		
		ClickSpeedTest = new JButton("Click Speed Test");
		add(ClickSpeedTest);
		
		WeirdAnimation = new JButton("Play a Weird Animation");
		add(WeirdAnimation);
		
		PongBallMovementKinda = new JButton("Play Weird Animation #2");
		add(PongBallMovementKinda);
		
		StartInstantMessanger = new JButton("Play Instant Messanger");
		add(StartInstantMessanger);
		
		ClickSpeedTest.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent event) {
				TCPS = new tensCPS();
			}
		});
		
		WeirdAnimation.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent event) {
				a.run();
			}
		});
		
		PongBallMovementKinda.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent event) {
				a3.run();
			}
		});
		
		StartInstantMessanger.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent event) {
				SIM.trulyStartInstantMessanger();
				
				StartStartServer SSS = new StartStartServer();
			}
		});
		
		setSize(250, 250);
		setVisible(true);
	}
}
