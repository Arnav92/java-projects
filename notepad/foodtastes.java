public class foodtastes {
	public static void main  (String args[]) {
	fanta a [] = new fanta [3];
	a [0] = new cola();	
	a [1] = new pepsi();
	a [2] = new fanta();
	
	for (int x = 0; x <= 2; x++) {
	a[x].eat();
}
}
}

class cola extends pepsi {
	void eat () {
	System.out.println("Oh, yeah, that's the stuff!!");
}
}

class pepsi extends fanta {
	void eat () {
	System.out.println("Definately worst m8.");
}
}

class fanta {
	void eat () {
	System.out.println("Not bad!");
}
}