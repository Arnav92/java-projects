import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PersonalBoxTest {
	public static void main (String args[]) {
	num pull = new num();
	pull.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pull.setSize(350, 100);
	pull.setVisible(true);
}
}

class num extends JFrame {
	private JTextField guessnum;

	public num () {
	super("Find Secret");
	setLayout(new FlowLayout());

	guessnum = new JTextField("Delete this text and type something, I'll guess it.", 20);
	add(guessnum);	

	thehandler control = new thehandler();
	guessnum.addActionListener(control);
}
	private class thehandler implements ActionListener {
	public void actionPerformed (ActionEvent event) {
	String string = "";
	
	if (event.getSource() == guessnum) { 
	string = String.format("What you typed was: %s", event.getActionCommand());
}
	JOptionPane.showMessageDialog(null, string);
}
}
}