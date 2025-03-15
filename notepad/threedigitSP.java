public class threedigitSP{

	public static void main (String args[]){
	int a, b;
	for (int x = 0; x < 10; x++){
	for (int y = 0; y < 10; y++){
	for (int z = 0; z < 10; z++){
	a = x+y+z;
	b = x*y*z;
	if (a == b){
	System.out.printf("The final number is: %d. The three digits used were %d, %d, and %d\n", a, x, y, z);
}
}
}
}
}
}