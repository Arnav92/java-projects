import java.util.Scanner;
public class VariableTest {
	public static void main (String args[]){
	int a;
	Test b = new Test();
	Scanner Jimmy = new Scanner (System.in);
	a = Jimmy.nextInt();
	if (a == 2) {
	b.second(2);
}	
}
}

class Test {
	private int a = 1;
	public void second(int a){
	Test2 t2 = new Test2();
	System.out.println("This is a test, so let's see what happens. See the code, and know some java to understand the idea behind this. ");
	System.out.println(this.a);
	System.out.println(a);
	a = this.a;
	System.out.println(a);
	a = 0;
	System.out.println(a);
	a = 1;
	System.out.println(a);
	this.a = 3;
	System.out.println(this.a);

	if (a == 1) {
	t2.weird();
}
}
}

class Test2 {
	private int c = 3;
	public void weird() {
	c = 2;
	System.out.println(c);
}
}