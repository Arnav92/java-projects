import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClickButton extends JFrame {
	public static void main (String args[]) {
	Buttons b = new Buttons();
	b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b.setSize(500, 250);
	b.setVisible(true);
}
}

class Buttons extends JFrame {

	private JButton Click;
	private String a = "You have the big gay";

	public Buttons () {
	super("Secret Box");
	setLayout(new FlowLayout());

	Click = new JButton ("ClickMe");
	add(Click);

	Occurence o = new Occurence();
	Click.addActionListener(o);
}
	private class Occurence implements ActionListener {
	public void actionPerformed (ActionEvent situation) {
	JOptionPane.showMessageDialog(null, String.format("%s", situation.getActionCommand()));
}
}
}