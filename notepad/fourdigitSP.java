public class fourdigitSP{

	public static void main (String args[]){
	int a, b;
	for (int x = 0; x < 10; x++){
	for (int y = 0; y < 10; y++){
	for (int z = 0; z < 10; z++){
	for (int d = 0; d < 10; d++){
	a = x+y+z+d;
	b = x*y*z*d;
	if (a == b){
	System.out.printf("The final number is: %d. The four digits used were %d, %d, %d, and %d\n", a, x, y, z, d);
}
}
}
}
}
}
}