import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents {
	public static void main (String args[]) {
	ME selection = new ME();
	selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	selection.setSize(1000, 1000);
	selection.setVisible(true);
}
}

class ME extends JFrame {
	private JPanel MP;
	private JLabel SB;
	public ME () {
	super("Title");
	
	MP = new JPanel();
	MP.setBackground(Color.WHITE);
	add(MP, BorderLayout.CENTER);

	SB = new JLabel("Default");
	add(SB, BorderLayout.SOUTH);

	Handlerclass handler = new Handlerclass();
	MP.addMouseListener(handler);
	MP.addMouseMotionListener(handler);
}
	private class Handlerclass implements MouseListener, MouseMotionListener {
	public void mouseClicked (MouseEvent event) {
	SB.setText(String.format("Clicked at %d, %d.", event.getX(), event.getY()));
}
	public void mousePressed (MouseEvent event) {
	SB.setText("You pressed the mouse!!");
}
	public void mouseReleased (MouseEvent event) {
	SB.setText("You realeased the button!!");
}
	public void mouseEntered (MouseEvent event) {
	SB.setText("You entered the area.");
	MP.setBackground(Color.BLUE);
}
	public void mouseExited (MouseEvent event) {
	SB.setText("You have exited the area.");
	MP.setBackground(Color.WHITE);
}
	public void mouseDragged (MouseEvent event) {
	SB.setText("You have dragged.");
}
	public void mouseMoved (MouseEvent event) {
	SB.setText("You have moved the mouse.");
}
}
}