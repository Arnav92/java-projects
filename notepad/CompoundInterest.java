import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String args[]){
	double amount, principle, rate, truer, extra;
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("What's the value of your extra (this will be divided by another value that you'll tell to get your rate)?");
	extra = Jimmy.nextDouble();
	System.out.println("What value divided by your extra equals your rate?");
	rate = Jimmy.nextDouble();
	truer = rate/extra;
	System.out.println("What's the value of your principle?");
	principle = Jimmy.nextDouble();
	System.out.println("Now, your compund interest for each line is your compound interest for that day.");
	
	for(int days=1;days<=120;days++){
	amount = principle*Math.pow(1 + truer, days);
	System.out.println("The value of your compound interest on year "+days+" is: "+amount);
}
}
}
	