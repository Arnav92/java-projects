import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RealMain extends JFrame {
		private JButton InitialText, LowerCased;
	
		public RealMain () {
			super("UpperCase Choice Menu");
			setLayout(new FlowLayout());
			
			InitialText = new JButton("Initial Text");
			InitialText.setRolloverEnabled(true);
			InitialText.setToolTipText("If Caps Lock is disabled, the text will be what you had previously written before you turned Caps Lock on, if you previously had Caps Lock on.");
			InitialText.addActionListener(new ActionListener () {

				public void actionPerformed(ActionEvent e) {
					Main m = new Main();
					
				}
				
			});
			add(InitialText);
			
			LowerCased = new JButton("Fully Lower Cased");
			LowerCased.setRolloverEnabled(true);
			LowerCased.setToolTipText("If Caps Lock is disabled, the whole text will be lower cased.");
			LowerCased.addActionListener(new ActionListener () {

				public void actionPerformed(ActionEvent e) {
					Main2 m2 = new Main2();
					
				}
				
			});
			add(LowerCased);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(250, 250);
			setVisible(true);
		}
}
