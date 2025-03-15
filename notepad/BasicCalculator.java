import java.util.Scanner;
public class BasicCalculator
{
	public static void main(String args[])
	{
	Scanner Jim = new Scanner (System.in);
	double fnum, snum, 
	string div, mul, add, sub;
	System.out.println("Enter first num: ");
	fnum = Jim.nextDouble();
	System.out.println("Choose symbol: ");
	div = Jim.nextString();
	mul = Jim.nextString();
	add = Jim.nextString();
	sub = Jim.nextString();
	System.out.println("Enter second num: ");
	snum = Jim.nextInt();
	add = fnum + snum;
	sub = fnum - snum
	mul = fnum * snum
	div = fnum / snum
	System.out.println(add);
	}
}
	
	