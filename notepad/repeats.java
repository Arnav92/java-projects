public class repeats
{
	public static void main(String args[]){
	double total = 0;
	for(double a = 1;a<=4202;a++){
	total += 1/Math.pow(2, a);
	}
	System.out.println("The number is: "+ total);
}
}