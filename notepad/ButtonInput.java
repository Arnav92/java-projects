import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonInput extends JFrame {
	public static void main (String args[]) {
	ButtonInput2 BI2 = new ButtonInput2();
	BI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	BI2.setSize(300, 150);
	BI2.setVisible(true);
}
}

class ButtonInput2 extends JFrame {

	private JButton reg;
	private JButton custom;

	public ButtonInput2() {
	super("The title");
	setLayout(new FlowLayout());

	reg = new JButton("Reg Button");
	add(reg);

	Icon a = new ImageIcon(getClass().getResource("a.png"));
	Icon b = new ImageIcon(getClass().getResource("b.png"));
	custom = new JButton("Custom", a);
	custom.setRolloverIcon(b);
	add(custom);
	HandlerClass handler = new HandlerClass();
	reg.addActionListener(handler);
	custom.addActionListener(handler);
}
	private class HandlerClass implements ActionListener {
	public void actionPerformed (ActionEvent event) {
	JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
}
}
}