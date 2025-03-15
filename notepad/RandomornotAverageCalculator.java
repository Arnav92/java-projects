import java.util.Scanner;
import java.util.Random;
public class RandomornotAverageCalculator
{
	public static void main (String args[]){
	int rarornar, aa, ab, ac, ad;
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("Alright, pick your values.");
	aa = Jimmy.nextInt();
	ab = Jimmy.nextInt();
	ac = Jimmy.nextInt();
	ad = Jimmy.nextInt();
	System.out.println("Your average is: "+nonranval(aa,ab,ac,ad));
}
	public static int nonranval(int...num){
	int total=0;
	for(int a:num)
	total+=a;
	return total/num.length;
	}
}


