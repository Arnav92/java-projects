import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BoxQuadratic {
	public static void main (String args[]) {
	realquad bob = new realquad();
	bob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bob.setSize(300, 300);
	bob.setVisible(true);
}
}

class realquad extends JFrame {
	public realquad () {
	super ("Quadratic Equation");
	String fn, sn, tn;
	double a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, w, x, y, z;
	JOptionPane.showMessageDialog(null, "This code will find the value of x in a quadratic equation, if you give the data needed below.", JOptionPane.PLAIN_MESSAGE);
	setLayout(new FlowLayout());
	fn = JOptionPane.showInputDialog("What is the value of a?");
	sn = JOptionPane.showInputDialog("What is the value of b?");
	tn = JOptionPane.showInputDialog("What is the value of c?");
	d = -4*a*c;
	e = Math.sqrt(Math.pow(b, 2) + d);
	f = -b + e;
	g = -b - e;
	h = 2*a;
	x = f / h;
	y = g / h;
	i = Math.pow(x, 2);
	j = a*i;
	k = b*x;
	l = Math.pow(y, 2);
	m = a*l;
	n = b*y;
	w = j + k + c;
	z = m + n + c;
	if (w == 0){
	JOptionPane.showMessageDialog(null, "The value of x is: "+x, JOptionPane.PLAIN_MESSAGE);
	if (z == 0){
	JOptionPane.showMessageDialog(null, "The value of x is: "+y, JOptionPane.PLAIN_MESSAGE);
}
}
	else {
	JOptionPane.showMessageDialog(null, "There is no value of x.", JOptionPane.PLAIN_MESSAGE);
}
}
}