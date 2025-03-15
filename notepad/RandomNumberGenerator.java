import java.util.Random;
public class RandomNumberGenerator
{
    public static void main(String args[]){
	Random num1 = new Random ();
	Random num2 = new Random ();
	int add = 0;
	int somenum = num1.nextInt();

	for(int a = 1; a<=somenum; a++){
	add += num2.nextInt();
	}
	System.out.println("The sum of your random numbers is: "+add);
}
}
	
