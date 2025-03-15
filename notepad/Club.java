import java.util.Scanner;
public class Club{
	public static void main (String args[]){
	Scanner Jimmy = new Scanner (System.in);
	String a, b, c, d;
	System.out.println("In this code, you have 2 members, choose their names.");
	System.out.println("List first name of member #1");
	a = Jimmy.nextLine();
	System.out.println("List last name of member #1");
	b = Jimmy.nextLine();
	System.out.println("List first name of member #2");
	c = Jimmy.nextLine();
	System.out.println("List last name of member #2");
	d = Jimmy.nextLine();
	Club2 member1 = new Club2 (""+a, ""+b);
	Club2 member2 = new Club2 (""+c, ""+d);
}
}

class Club2{
	private String first;
	private String last;
	private static int totalmembers = 0;

	public Club2(String fn, String ln){
	first = fn;
	last = ln;
	totalmembers++;
	System.out.printf("Member #%d is %s %s\n", totalmembers, first, last);
}

	public String getFirst(){
	return first;
}

	public String getLast(){
	return last;
}

	public static int getTotalmembers(){
	return totalmembers;
}
}