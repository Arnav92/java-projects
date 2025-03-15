public enum ran{
	First(“Hey”, “14”),
	Second(“How”, “14”),
	Last(“Ok”, “23”);
	
	private final String randomwords;
	private final String randomnumbers;

	ran(String randomword2, String randomnumbers2){
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

class Testenum{

	public static void main (String args[]){
	for (ran display: ran.values)
	System.out.printf("%s\t%s\t%s\n", display, display.getrandomwords(), display.getrandomnumbers());
}
}