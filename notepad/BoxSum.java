import javax.swing.JOptionPane;
public class BoxSum {
	public static void main (String args[]) {
	JOptionPane.showMessageDialog(null, "This code will find the sum of two given numbers", "Introduction", JOptionPane.PLAIN_MESSAGE);
	String fn = JOptionPane.showInputDialog("Enter first number");
	String sn = JOptionPane.showInputDialog("Enter second number");
	
	double num1 = Double.parseDouble(fn), num2 = Double.parseDouble(sn), sum = num1 + num2;
	JOptionPane.showMessageDialog(null, "The answer is: " +sum, "The Title", JOptionPane.PLAIN_MESSAGE);
}
}