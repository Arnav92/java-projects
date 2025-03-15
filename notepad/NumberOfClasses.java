public class NumberOfClasses {
	public static void main (String args[]) {
	SumClasses sum = new SumClasses ();
	Football f = new Football ();
	Badminton b = new Badminton ();
	sum.add(f);
	sum.add(b);
}
}

class Football extends AllSports {
	public void test1 () {

}
}

class Badminton extends AllSports {
	public void test2 () {
	
}
}

class AllSports {
	public void test3 () {

}
}

class SumClasses {
	private AllSports[] thelist = new AllSports[10];
	private int info = 1;

	public void add (AllSports a) {
	if (info < thelist.length) {	
	System.out.println("Sport added at index: "+info);
	info++;
}
}
}