import java.util.Formatter;
import java.io.*;
import java.lang.*;
import java.util.*;

public class FileCreatorwithEditor {
	public static void main (String args[]) {
	FileEditor FE = new FileEditor();
	FE.openFile();
	FE.addRecords();
	FE.closeFile();
}
}

class FileEditor {
	private Formatter a;
	private String x = "14", y = "Arnav", z = "Kumar", b = "40", c = "Reena", d = "Kumar", e = "41", f = "Pawan", g = "Kumar";
	public void openFile () {
	try {
	a = new Formatter("TestyBoi.txt");
}
	catch (Exception e) {
	System.out.println("You have the big dumb!!");
}
}
	public void addRecords () {
	a.format("%s %s %s \n%s %s %s\n%s %s %s", x, y, z, b, c, d, e, f, g);
}
	public void closeFile () {
	a.close();
}
}