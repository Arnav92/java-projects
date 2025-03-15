import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickCount extends JFrame {
		private int earnClickCount;
		private String CC;
		private JLabel ClickCount;
		private static getClickCount gCC = new getClickCount();
	
		public ClickCount () {
			super("JFrame 2");
			setLayout(new FlowLayout());
			
			earnClickCount = gCC.realgetClickCount();
			
			CC = String.format("Your Click Count is: %s", earnClickCount);
			
			ClickCount = new JLabel(CC);
			add(ClickCount);
			
			setSize(250, 250);
			setVisible(true);
		}
}