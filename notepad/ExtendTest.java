public class ExtendTest extends Extend2 {
	public static void main (String args[]) {
	System.out.println("First extends quote");
	Extend2 a = new Extend2();
	a.Extend3number2();
	a.Extend3number3();
	ExtendTest b = new ExtendTest ();
	b.Extend3number2();
}
	void Extend3number2 () {
	System.out.println("\nSecond section of third extends quote");
}
	public ExtendTest () {
	System.out.println("I dunno what to name extends quote");
}
}

class Extend2 extends Extend3 {
	public Extend2 () {
	System.out.println("Second extends quote");
}
	void Extend3number2 () {
	System.out.println("\nSecond section of third extends quote #2");
}
	public void Extend3number3 () {
	System.out.println("\nThird section of third extends quote #2");
} 	
}

class Extend3 {
	public Extend3 () {
	System.out.println("Third extends quote");
}
	void Extend3number2 () {
	System.out.println("\nSecond section of third extends quote");
}
	public void Extend3number3 () {
	System.out.println("\nThird section of third extends quote");
} 	
} 	
