import java.util.*;

public class ExceptionHandling {
	public static void main (String args[]) {
	int a = 1;
	a = 1;
	do {
	try {
	Scanner Jimmy = new Scanner (System.in);

	System.out.println("This program can divide any 2 numbers that have known answers.");

	System.out.println("Enter first num: ");
	double n1 = Jimmy.nextDouble();

	System.out.println("Enter second num: ");
	double n2 = Jimmy.nextDouble();

	double divisor = n1/n2;

	System.out.println("The first number divided by the second number = " +divisor);
	a = 2;
}
	catch (Exception e) {
	System.out.println("Nice try, but you can't do that. Try again.");
}
} while (a == 1);
}
}