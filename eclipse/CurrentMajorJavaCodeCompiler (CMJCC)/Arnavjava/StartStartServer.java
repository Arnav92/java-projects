import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartStartServer extends JFrame {
	private JButton StartClientTest;
	private ClientTest CT = new ClientTest();
	
	public StartStartServer () {
		super("Start Client");
		setLayout(new FlowLayout());
		
		StartClientTest = new JButton("Begin Client");
		add(StartClientTest);
		
		StartClientTest.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent event) {
				CT.startClientTest();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 250);
		setVisible(true);
	}
}
