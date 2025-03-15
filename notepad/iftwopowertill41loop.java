public class iftwopowertill41loop{
	public static void main (String args[]){
	for (double a = 32; a <= 100; a++){
	if (Math.pow(a, 2) > 999 && Math.pow(a, 2) < 10001){
	System.out.printf("%s squared is equal to ", a);
	System.out.print(Math.pow(a, 2));
	System.out.println();
}
}
	for (double b = 10; b <= 100; b++){
	if (Math.pow(b, 3) > 999 && Math.pow(b, 3) < 10001){
	System.out.printf("%s cubed is equal to ", b);
	System.out.print(Math.pow(b, 3));
	System.out.println();
}
}
	for (double c = 4; b <= 6; b++){
	if (Math.pow(c, 5) > 999 && Math.pow(c, 5) < 10001){
	System.out.printf("%s to the power of five is equal to ", c);
	System.out.print(Math.pow(c, 5));
	System.out.println();
}
}
}
}