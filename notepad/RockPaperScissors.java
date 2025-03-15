import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class RockPaperScissors {
	public static void main (String args[]) {
	Everything f = new Everything();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(150, 150);
	f.setVisible(true);
}
}

class Everything extends JFrame {
	private JLabel memeapplier = new JLabel();
	private String a;
	private int zerototwo, b;
	private JButton Rock, Paper, Scissors;
	private Icon meme;

	public Everything () {
	super("Rock, Paper, Scissors");
	setLayout(new FlowLayout());

	meme = new ImageIcon(getClass().getResource("Screenshot 2020-01-04 22.16.30.png"));
	memeapplier = new JLabel ("", meme, JLabel.CENTER);
	memeapplier.setBounds(0, 0, 0, 0);
	add(memeapplier);

	Rock = new JButton("Rock");
	Paper = new JButton("Paper");
	Scissors = new JButton("Scissors");
	add(Rock);
	add(Paper);
	add(Scissors);

	IfClicked I = new IfClicked();
	Rock.addActionListener(I);
	Paper.addActionListener(I);
	Scissors.addActionListener(I);
}
	private class IfClicked implements ActionListener {
	public void actionPerformed (ActionEvent event) {
	Random Number = new Random();
	zerototwo = Number.nextInt(3);

	if (zerototwo == 0) {
	a = "Rock";
}
	else if (zerototwo == 1) {
	a = "Paper";
}
	else if (zerototwo == 2) {
	a = "Scissors";
}

	if (zerototwo == 0 && event.getSource() == Rock) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have tied!!", event.getActionCommand(), a));
}
	if (zerototwo == 1 && event.getSource() == Rock) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have won!!", event.getActionCommand(), a));
}
	if (zerototwo == 2 && event.getSource() == Rock) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have lost!!", event.getActionCommand(), a));
}
	if (zerototwo == 0 && event.getSource() == Paper) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have won!!", event.getActionCommand(), a));
}
	if (zerototwo == 1 && event.getSource() == Paper) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have tied!!", event.getActionCommand(), a));
}
	if (zerototwo == 2 && event.getSource() == Paper) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have lost!!", event.getActionCommand(), a));
}
	if (zerototwo == 0 && event.getSource() == Scissors) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have lost!!", event.getActionCommand(), a));
}
	if (zerototwo == 1 && event.getSource() == Scissors) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have won!!", event.getActionCommand(), a));
}
	if (zerototwo == 2 && event.getSource() == Scissors) {
	JOptionPane.showMessageDialog(null, String.format("You chose %s, and the AI chose %s \nTherefore, you have tied!!", event.getActionCommand(), a));
}
}
}
}