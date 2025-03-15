import java.util.Scanner;
public class RegularTime
{
	public static void main (String[]args){
	System.out.println(Military());
}
	public static String Military(){
	int hour, minute, second, h, m, s;
	Scanner Jimmy = new Scanner (System.in);
	System.out.println("This program will put your time in regular time with a few questions");
	System.out.println("What's the hour? Don't lie, otherwise it'll automatically say 00 for that part");
	h = Jimmy.nextInt();
	System.out.println("What's the minute? Don't lie, otherwise it'll automatically say 00 for that part");
	m = Jimmy.nextInt();
	System.out.println("What's the second? Don't lie, otherwise it'll automatically say 00 for that part");
	s = Jimmy.nextInt();
	hour = ((h>=0 && 24<=h) ? h : 0);
	minute = ((m>=0 && 60<=m) ? m : 0);
	second = ((s>=0 && 60<=s) ? s : 0);
	System.out.println("Below is your time:");
	return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12 : hour%12), minute, second, ((hour < 12)? "AM" : "PM"));
}
}