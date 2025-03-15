import java.util.Random;
public class ThisIsFun
{
    public static void main(String args[]){
	Random a = new Random ();
	Random b = new Random ();
	Random c = new Random ();
	Random d = new Random ();
	int i = 0;
	int e = a.nextInt();
	int f = b.nextInt();
	int g = c.nextInt();
	int h = d.nextInt();
	int Jimmy[] = {e, f, g, h};
	
	for(int j: Jimmy){
	i += j;
	}
	System.out.println("The sum of the 4 random values is: "+i);
}
}