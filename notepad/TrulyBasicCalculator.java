import java.util.Scanner;
public class TrulyBasicCalculator
{
    public static void main(String args[]){
	Scanner Jimmy = new Scanner (System.in);
	int fnum, snum, addition;
	System.out.println("Enter first integer: ");
	fnum = Jimmy.nextInt();
	System.out.println("Enter second integer: ");
	snum = Jimmy.nextInt();
	addition = fnum + snum;
	System.out.println("The sum of the previously inputted integers is: "+addition);
	}
}
	
