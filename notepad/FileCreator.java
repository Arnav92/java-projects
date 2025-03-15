import java.util.Formatter;

public class FileCreator {
	public static void main (String args[]) {
	final Formatter a;

	try {
	a = new Formatter("FileCreationTest.txt");
	System.out.println("Woooo, the file has been created!!");
}
	catch (Exception e) {
	System.out.println("OoPSiE DOoPsIe, java made a PoOpsIe?!");
}
}
}