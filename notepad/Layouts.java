import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layouts {
	public static void main (String args[]) {
	Buttons b = new Buttons();
	b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b.setSize(1000, 1000);
	b.setVisible(true);
}
}

class Buttons extends JFrame {
	private JButton LB, CB, RB;
	private FlowLayout L;
	private Container C;
	public Buttons () {
	super("Layouts");

	L = new FlowLayout();
	C = getContentPane();
	setLayout(L);

	LB = new JButton("Left");
	add(LB);
	LB.addActionListener(
	new ActionListener () {
	public void actionPerformed (ActionEvent event) {
	L.setAlignment(FlowLayout.LEFT);
	L.layoutContainer(C);
}
}
);
	CB = new JButton("Center");
	add(CB);
	CB.addActionListener(
	new ActionListener () {
	public void actionPerformed (ActionEvent event) {
	L.setAlignment(FlowLayout.CENTER);
	L.layoutContainer(C);
}
}
);
	RB = new JButton("Right");
	add(RB);
	RB.addActionListener(
	new ActionListener () {
	public void actionPerformed (ActionEvent event) {
	L.setAlignment(FlowLayout.RIGHT);
	L.layoutContainer(C);
}
}
);
}
}