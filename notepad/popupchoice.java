import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class popupchoice {
	public static void main (String args[]) {
	builder bob = new builder();
	bob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bob.setSize(300, 300);
	bob.setVisible(true);
}
}

class builder extends JFrame{
	private JLabel item1;
	public builder () {
	super ("Hint: Hover");
	setLayout(new FlowLayout());
	item1 = new JLabel("Nothing here");
	item1.setToolTipText("Ya found the true secret!!");
	add(item1);
}
}