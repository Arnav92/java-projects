import java.util.Scanner;
public class MilitaryTime
{
	public static void main (String args[]){
	System.out.println(Military1());
}
	public static String Military1(){
	int hour, minute, second, h, m, s;
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("This program will put your time in military time with a few questions");
	System.out.println("What's the hour? Don't lie, otherwise it'll automatically say 00 for that part");
	h = Jimmy.nextInt();
	System.out.println("What's the minute? Don't lie, otherwise it'll automatically say 00 for that part");
	m = Jimmy.nextInt();
	System.out.println("What's the second? Don't lie, otherwise it'll automatically say 00 for that part");
	s = Jimmy.nextInt();
	hour = ((h>=0 && 24>=h) ? h : 0);
	minute = ((m>=0 && 60>=m) ? m : 0);
	second = ((s>=0 && 60>=s) ? s : 0);
	System.out.println("Below is your time:");
	return String.format("%02d:%02d:%02d", hour, minute, second );
}
}