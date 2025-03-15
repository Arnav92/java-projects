import java.util.Formatter;
import.java.io.*;
import java.lang.*;
import java.util.*;

public class FileCreator&Editor {
	public static void main (String args[]) {
	FileEditor FE = new FileEditor();
	FE.openFile();
	FE.addRecords();
	FE.closeFile();
}
}

class FileEditor {
	private Formatter a;
	public void openFile () {
	try {
	a = new Formatter("TestyBoi.txt");
}
	catch (Exception e) {
	System.out.prinntln("You have the big dumb!!");
}
}
	public void addRecords () {
	a.format("", "14 ", "Arnav ", "Kumar");
}
	public void closeFile () {
	a.close();
}
}