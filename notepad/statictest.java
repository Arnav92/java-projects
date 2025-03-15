public class statictest {
	private static int a = 0;
	private static int b;
	private static int c;
	public static void main (String args[]) {
	b = a + 1;
	c = a + 1;
	System.out.printf("The value of b is: %s, and the value of c is: %s", b, c);
}
}