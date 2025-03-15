public class Inheritance {
	public static void main (String args[]) {
	Inheritance2 newinherit = new Inheritance2 ();

	newinherit.inherit();
	newinherit.inherit2();
}
}

class Inheritance2 extends Inheritance3 {
	public void inherit () {
	System.out.println("Cool");
}
}

class Inheritance3 {
	public void inherit () {
	System.out.println("Hello");
}
	public void inherit2 () {
	System.out.println("Hello 2");
}
}