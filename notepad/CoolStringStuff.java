public class CoolStringStuff {
	public static void main (String args[]) {
	String a = "apples";
	String b = "bucky";
	String c = "BUCKY";
	
	System.out.println("The length of string a is: "+a.length());

	if (b.equals(c)) {
	System.out.println("b equals c!!");
}
	else {
	System.out.println("b does not equal c!!");
}
	if (b.equalsIgnoreCase(c)) {
	System.out.println("b equals c if you ignore capitalization!!");
}
	else {
	System.out.println("b does not equal c even if you ignore capitalization!!");
}
}
}