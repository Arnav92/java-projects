import java.util.*;
import java.io.*;

public class FileReader {
	public static void main (String args[]) {
	FileEditor FE = new FileEditor();
	FE.openFile();
	FE.readFile();
	FE.closeFile();
}
}

class FileEditor {
	private Scanner a;
	public void openFile () {
	try {
	a = new Scanner (new File("TestyBoi.txt"));
}
	catch (Exception e) {
	System.out.println("TF, you dumb?");
}
}
	public void readFile () {
	while (a.hasNext()) {
	String b = a.next();
	String c = a.next();
	String d = a.next();

	System.out.printf("%s %s %s\n", b, c, d);
}
}
	public void closeFile () {
	a.close();
}
}