import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class RadioButton {
	public static void main (String args[]) {
	OneCheck Check = new OneCheck();
	Check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Check.setSize(1285, 750);
	Check.setVisible(true);
}
}

class OneCheck extends JFrame {
	private JTextField tf;
	private Font PlainFont;
	private Font BoldFont;
	private Font ItalicFont;
	private Font BoldandItalicFont;
	private JRadioButton PlainRadio;
	private JRadioButton BoldRadio;
	private JRadioButton ItalicRadio;
	private JRadioButton BoldandItalicRadio;
	private ButtonGroup Group;
	private int size;

	public OneCheck () {
	super("Bold &/or Italics");
	setLayout(new FlowLayout());

	Scanner Jimmy = new Scanner(System.in);	
	System.out.print("Size of text: ");
	size = Jimmy.nextInt();

	tf = new JTextField("Italicize &/or Bold me", size);
	add(tf);

	PlainRadio = new JRadioButton("Plain", true);
	BoldRadio = new JRadioButton("Bold", false);
	ItalicRadio = new JRadioButton("Italic", false);
	BoldandItalicRadio = new JRadioButton("Bold & Italic", false);
	add(PlainRadio);
	add(BoldRadio);
	add(ItalicRadio);
	add(BoldandItalicRadio);

	Group = new ButtonGroup();
	Group.add(PlainRadio);
	Group.add(BoldRadio);
	Group.add(ItalicRadio);
	Group.add(BoldandItalicRadio);

	PlainFont = new Font("Arial", Font.PLAIN, size);
	BoldFont = new Font("Arial", Font.BOLD, size);
	ItalicFont = new Font("Arial", Font.ITALIC, size);
	BoldandItalicFont = new Font("Arial", Font.BOLD + Font.ITALIC, size);
	tf.setFont(PlainFont);

	PlainRadio.addItemListener(new HandlerClass(PlainFont));
	BoldRadio.addItemListener(new HandlerClass(BoldFont));
	ItalicRadio.addItemListener(new HandlerClass(ItalicFont));
	BoldandItalicRadio.addItemListener(new HandlerClass(BoldandItalicFont));
}
	private class HandlerClass implements ItemListener {
	private Font font;
	public HandlerClass (Font f) {
	font = f;
}
	public void itemStateChanged (ItemEvent event) {
	tf.setFont(font);
}
}
}