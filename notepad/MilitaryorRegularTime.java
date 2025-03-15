import java.util.Scanner;
public class MilitaryorRegularTime {
	public static void main(String args[]){
	int a;
	Scanner Timmy = new Scanner (System.in);
	System.out.println("This code will give you your military, or regular time depending on what you say.");
	System.out.println("Do you want military, or regular time? Type 1 for military time. Type 2 for regular time.");
	a = Timmy.nextInt();
	if (a==1){
	MilitaryTime militaryObject = new MilitaryTime();
	militaryObject.second();
}
	if (a==2){
	RegularTime regularObject = new RegularTime();
}
	if (a<1||a>2){
	System.out.println("Nice try, but no, there's no secret egg, or whatever you were expecting to happen");
}
class MilitaryTime
{
	public void second(){
	System.out.println(Military1());
}
	public String Military1(){
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

class RegularTime
{
	public void third(){
	System.out.println(Military2());
}
	public String Military2(){
	int hour, minute, second, h, m, s;
	Scanner Kimmy = new Scanner (System.in);
	System.out.println("This program will put your time in regular time with a few questions");
	System.out.println("What's the hour? Don't lie, otherwise it'll automatically say 00 for that part");
	h = Kimmy.nextInt();
	System.out.println("What's the minute? Don't lie, otherwise it'll automatically say 00 for that part");
	m = Kimmy.nextInt();
	System.out.println("What's the second? Don't lie, otherwise it'll automatically say 00 for that part");
	s = Kimmy.nextInt();
	hour = ((h>=0 && 24>=h) ? h : 0);
	minute = ((m>=0 && 60>=m) ? m : 0);
	second = ((s>=0 && 60>=s) ? s : 0);
	System.out.println("Below is your time:");
	return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12 : hour%12), minute, second, ((hour < 12)? "AM" : "PM"));
}
}
}
}