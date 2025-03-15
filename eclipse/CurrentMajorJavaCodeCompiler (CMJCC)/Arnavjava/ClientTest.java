import javax.swing.JFrame;

public class ClientTest {
	public ClientTest () {
		
	}
	
	public static void startClientTest () {
		Client c = new Client("127.0.0.1");
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.startRunning();
	}
}
