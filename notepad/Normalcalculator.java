import java.util.Scanner;
public class Normalcalculator
{
    public static void main(String args[]){
	double a, b, c;
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("Enter first number: ");
	a = Jimmy.nextDouble();
	System.out.println("Enter a symbol (1 = +, 2 = -, 3 = /, 4 = *, 5 = square root (if you pick 5, then you will only square root the second value later given), 6 = first value to the power of the second value): ");
	b = Jimmy.nextDouble();
	System.out.println("Enter second number: ");
	c = Jimmy.nextDouble();
	if (b==1){
	System.out.println("Your value is: "+(a+c));
	}
	else
	{
	if (b==2){
	System.out.println("Your value is: "+(a-c));
	}
	else
	{
	if (b==3){
	System.out.println("Your value is: "+(a/c));
	}
	else
	{
	if (b==4){
	System.out.println("Your value is: "+(a*c));
	}
	else
	{
	if (b==5){
	System.out.println("Your value is: "+(Math.sqrt(c)));
	}
	else
	{
	if (b==6){
	System.out.println("Your value is: "+(Math.pow(a, c)));
	}
	else
	{
	if (b>6){
	System.out.println("Nice try, but this isn't allowed");
	}
}
}
}
}
}
}
}
}

	
	