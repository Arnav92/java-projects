import java.util.Random;
public class Bettingcode
{
    public static void main(String args[]){
	Random value = new Random();
	int number;
	
	for(int counter=1;counter<=5;counter++){
	number = 1+value.nextInt(2147483647);
	System.out.println("Your random number is: "+number);
}
}
}