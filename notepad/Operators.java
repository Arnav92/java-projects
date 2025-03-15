import java.util.Scanner;
public class Operators
{ 
	static final float a = 4F;
	static final float b = 5F;
	static final float e = 0F;
	static final float f = 0F;
	static final int l = 7;
	static final boolean x = true;
	static final boolean y = true;
	static final boolean z = false; 
	public static void main(String args[]){
	Scanner Test = new Scanner (System.in);
	float c = a/b;
	System.out.println("The value of c is " +c);
	float d = c/b;
	System.out.println("The value of d plus 1 is " +(++d));
	System.out.println("The value of d minus 1 is " +(--d));
	System.out.println("The remainder of d from c is " +(d%c));
	System.out.println("Therefore, the statement: d-1=d modc is true!");
	System.out.println("Let's see what the computer thinks. Oh, computer, is d-1=d modc true?; "+(d==d));
	System.out.println("See, it agrees! Or maybe I cheated the system...you'll never know, muahahahahaha.");
	System.out.println("Moving on..., ahem, let's just do something else...");
	System.out.println("Well, let's play a similar game to what we just played. First, oh computer, is e not = to f?; "+(e!=f));
	System.out.println("Shouldn't this therefore mean that e divided by f = 1. Let's see, oh, computer is e/f=1?; "+(e/f==1));
	System.out.println("Wait, how is this possible?! I'll leave that for you to figure out");
	System.out.println("Now, I'm going to play a game with you. It's easy, so don't overthink it. These are the rule: a variable is either true or false, two trues = true, everything else = false for the AND command. ");
	System.out.println("In the or command, if one is true, it'll say 'true'");
	System.out.println("The NOT command explains whether something is true, or not true by saying 'true' or 'false' if something's true. Now, master computer will answer everything, and since master computer is never wrong, figure out this puzzle. Oh, computer, y OR z?; "+(y||z));
	System.out.println("Oh, computer, x AND z?; "+(x&&z));
	System.out.println("Now, mathematically prove to me all possible combinations for all the listed values. And explain whether the information I gave you norrowed the possibilities, or not.");
	System.out.println("Now, I'll allow you to break the fourth wall. ");
	System.out.println("The value of str is " + (l<<2)); 
	System.out.println(Test.nextLine());

	}
}
