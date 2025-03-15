public class FalseIfTest {
	public static void main (String args[]) {
	int a, b, c;
	for (a = 1; a <= 3; a++) {
	for (b = 1; b <= 3; b++) {
	for (c = 1; c <= 3; c++) {
	if (a != b && a != c && b != c) {
	System.out.printf("The value of a is: %s, the value of b is: %s, the value of c is: %s", a, b, c);
}
}
}
}
}
}