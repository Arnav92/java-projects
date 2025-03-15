import java.io.File;

public class FileClass {
	public static void main (String args[]) {
	File a = new File("C:\\Arnavjava\\TestString.txt");

	if (a.exists()) {
	System.out.println(a.getName() + " exists!!");
}
	else {
	System.out.println(a.getName() + " doesn't exist!!");
}
}
}