public class twodigitSP{

	public static void main (String args[]){
	int a, b;
	for (int x = 0; x < 10; x++){
	for (int y = 0; y < 10; y++){
	a = x+y;
	b = x*y;
	if (a == b){
	System.out.printf("The final number is: %d. The two digits used were %d, and %d\n", a, x, y);
}
}
}
}
}