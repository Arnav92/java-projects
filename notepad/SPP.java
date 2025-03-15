public class SPP {
	public static void main (String args[]) {
	AllAnimals[] everything = new AllAnimals[3];
	AllAnimals AA = new AllAnimals();
	Fox f = new Fox();
	Dog d = new Dog();

	everything[0] = f;
	everything[1] = d;
	everything[2] = AA;

	for (AllAnimals x: everything) {
	x.noise();
}
}
}

class Fox extends AllAnimals {
	public void noise () {
	System.out.println("Fox goes: What does the fox say? \n");
}
}

class Dog extends AllAnimals {
	public void noise () {
	System.out.println("Dog goes: Woof \n");
}
}

class AllAnimals {
	public void noise () {
	System.out.println("All animals together just sound like a bunch of gay noises.");
}
}