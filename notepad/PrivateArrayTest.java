public class PrivateArrayTest {
	private static int[] a = {11};
	public static void main (String args[]) {
	int b[] = {1, 2, 3};
	//However, the private array above can not be static inside of this method (even if it's not private)!!
	System.out.println("array a = "+a[0]);
	System.out.println("array b, number 1 = "+b[0]);
}
}