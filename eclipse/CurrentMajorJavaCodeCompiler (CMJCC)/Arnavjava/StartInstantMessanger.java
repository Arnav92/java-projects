import javax.swing.JFrame;
 
public class StartInstantMessanger {
	public StartInstantMessanger () {
		
	}
	
	public static void trulyStartInstantMessanger () {
		Server s = new Server();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.startRunning();
	}
}
