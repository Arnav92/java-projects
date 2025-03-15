import java.util.Scanner;
public class QuadraticFormula {
	public static void main (String args[]){
	Scanner Jimmy = new Scanner (System.in);
	double a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, w, x, y, z;
	System.out.println("This code will give you the value of x for any quadratic equation if the information below is given (values must be given in decimal form)");
	System.out.println("What is the value of a?");
	a = Jimmy.nextDouble();
	System.out.println("What is the value of b?");
	b = Jimmy.nextDouble();
	System.out.println("What is the value of c?");
	c = Jimmy.nextDouble();
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
	System.out.println("The value of x is: "+x);
	if (z == 0){
	System.out.println("The value of x is: "+y);
}
}
	else {
	System.out.println("There is no value of x");
}
}
}