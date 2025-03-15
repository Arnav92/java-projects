public class Birthintro {
	public static void main (String args[]){
	backend a = new backend (13, 5, 2005);
	frontend b = new frontend ("Arnav", a);
	System.out.print(b);
}
}

class frontend{
	private String name;
	private backend date;
	public frontend(String theName, backend theDate){
	name = theName;
	date = theDate;
}
	public String toString(){
	return String.format("                                                                             My name is %s, and my birthday is on %s", name, date);
}
}

class backend{
	private int year, month, day;
	public backend(int y, int m, int d){
	year = y;
	month = m;
	day = d;
	System.out.printf("The value for this constructor is %s", this);
}
	public String toString(){
	return String.format("%d/%d/%d", day, month, year); 
}
}

