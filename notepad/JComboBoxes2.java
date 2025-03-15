import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxes2 {
	public static void main (String args[]) {
	wombo combo = new wombo();
	combo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	combo.setSize(350, 100);
	combo.setVisible(true);
}
}

class wombo extends JFrame {
	private JComboBox box;
	private JLabel picture;

	private static String[] filename = {"a.png", "b.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

	public wombo () {
	super("Title");
	setLayout(new FlowLayout());

	JComboBox box = new JComboBox(filename);

	box.addItemListener(
	new ItemListener() {
	public void itemStateChanged (ItemEvent event) {
	if (event.getStateChange() == event.SELECTED) {
	picture.setIcon(pics[box.getSelectedIndex()]);
}
}
}
);
	add(box);
	picture = new JLabel(pics[0]);
	add(picture);
}
}