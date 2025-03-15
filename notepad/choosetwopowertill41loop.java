import java.util.Scanner;
public class choosetwopowertill41loop{
	public static void main (String args[]){
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("Choose the limit to the powers of 2");
	double b = Jimmy.nextDouble();
	System.out.println("Choose the start to the powers of 2");
	for (double a = Jimmy.nextDouble(); a <= b; a++){
	System.out.printf("%s is equal to ", a);
	System.out.print(Math.pow(a, 2));
	System.out.println();
}
}
}