import java.util.EnumSet;
public class Testenum{

	public static void main (String args[]){
	String a;
	for (ran display: ran.values())
	System.out.printf("%s\t%s\t%s\n", display, display.getrandomwords(), display.getrandomnumbers());
	
	System.out.print("\nNow, let's test the something!!\n\n");


	for(ran display: EnumSet.range(ran.Second, ran.Last))
	System.out.printf("%s\t%s\t%s\n", display, display.getrandomwords(), display.getrandomnumbers());

	System.out.print("\nIt worked, yay!!\n");
}
}

enum ran{
	First("Ayy", "14"),
	Second("Damn", "14"),
	Last("Ok", "23");
	
	private final String randomwords;
	private final String randomnumbers;

	ran(String randomwords2, String randomnumbers2){
	randomwords = randomwords2;
	randomnumbers = randomnumbers2;
}
	public String getrandomwords(){
	return randomwords;
}	
	public String getrandomnumbers(){
	return randomnumbers;
}
}