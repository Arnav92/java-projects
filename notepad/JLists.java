import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListss {
	public static void main (String args[]) {
	wombo combo = new wombo();
	combo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	combo.setSize(350, 100);
	combo.setVisible(true);
}
}

class wombo extends JFrame {
	private JList list;
	private static String[] colornames = {"purple", "pink", "blue", "red"};
	private static Color[] colors = {Color.BLACK, Color.PINK, Color.BLUE, Color.RED};
	public wombo () {
	super("Title");
	setLayout(new FlowLayout());

	list = new JList(colornames);
	list.setVisibleRowCount(4);
	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	add(JScrollPane(list));

	list.addListSelectionListener(
	new ListSelectionListener() {
	public void valueChanged(ListSelectionEvent event) {
	getContentPane().setBackground(colors[list.getSelectedIndex]);
}
}
);
}
}