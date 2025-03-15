import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Boxtest {
	public static void main (String args[]) {
	fish pull = new fish();
	pull.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pull.setSize(350, 100);
	pull.setVisible(true);
}
}

class fish extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField YoPassword;
	public fish () {
	super ("Buncha diffawent passwars");
	setLayout (new FlowLayout());

	item1 = new JTextField (20);
	add(item1);

	item2 = new JTextField ("Text smthn boi");
	add(item2);

	item3 = new JTextField ("Uneditable Wombo Combo", 10);
	item3.setEditable(false);
	add(item3);

	YoPassword = new JPasswordField("Nice thinking boi");
	add(YoPassword);

	thehandler control = new thehandler();
	item1.addActionListener(control);
	item2.addActionListener(control);
	item3.addActionListener(control);
	YoPassword.addActionListener(control);
}

	private class thehandler implements ActionListener {
	public void actionPerformed (ActionEvent event) {
	String string = "";
	
	if (event.getSource() == item1) { 
	string = String.format("format 1: %s", event.getActionCommand());
}
	else if (event.getSource() == item2) {
	string = String.format("format 2: %s", event.getActionCommand());
}
	else if (event.getSource() == item3) {
	string = String.format("format 3: %s", event.getActionCommand());
}
	else if (event.getSource() == YoPassword) {
	string = String.format("password field is: %s", event.getActionCommand());
}
	JOptionPane.showMessageDialog(null, string);	
}
}
}
	