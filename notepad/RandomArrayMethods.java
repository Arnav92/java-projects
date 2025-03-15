import java.util.Random;
public class RandomArrayMethods
{
    public static void main(String args[]){
	System.out.println("Let's test your basic mathematics");
	int Jimmy[]={38019, 209, 2198, 28109, 40812, 413439820};
	second(Jimmy);
	for(int b:Jimmy)
	System.out.println("Every number listed after the colon has been increased by 10. What was its original value?: "+b);
}
	public static void second(int a[]){
	for(int rannumsum = 0;rannumsum<a.length;rannumsum++)
	a[rannumsum]+=10;
}
}