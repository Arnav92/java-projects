import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
public class fonts extends JFrame {
	public static void main (String args[]) {
	fontcreator fonts = new fontcreator();
	fonts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fonts.setSize(1, 1);
	fonts.setVisible(true);
}
}

class fontcreator extends JFrame {
	private int a;
	private JTextField jtf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	public fontcreator () {
	super("Title Boi");
	setLayout(new FlowLayout());

	Scanner Jimmy = new Scanner(System.in);
	System.out.println("This code can italicize &/or make everything you type in the box that you'll see soon bold.");
	System.out.println("What should the size of all boxes be?");
	a = Jimmy.nextInt();

	jtf = new JTextField("Acra cadabra");
	jtf.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, a));
	add(jtf);

	boldbox = new JCheckBox("Bold");
	boldbox.setFont(new Font("Arial", Font.BOLD, a));
	italicbox = new JCheckBox("Italic");
	italicbox.setFont(new Font("Arial", Font.BOLD, a));
	add(boldbox);
	add(italicbox);	

	HandlerClass handler = new HandlerClass();
	boldbox.addItemListener(handler);
	italicbox.addItemListener(handler);
}
	private class HandlerClass implements ItemListener {
	public void itemStateChanged (ItemEvent event) {
	Font font = null;

	if (boldbox.isSelected() && italicbox.isSelected()) {
	font = new Font ("Arial", Font.BOLD + Font.ITALIC, a); 
}
	else if (boldbox.isSelected()) {
	font = new Font ("Arial", Font.BOLD, a);
}
	else if (italicbox.isSelected()) {
	font = new Font ("Arial", Font.ITALIC, a);
}
	else {
	font = new Font ("Arial", Font.PLAIN, a);
}
	jtf.setFont(font);
}
}
}