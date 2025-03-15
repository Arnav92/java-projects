public class NestedDecisions
{
	 public static void main(String args[]) 
	{
	int a = 1;
	if(a<9)
	{
	   switch(a)
	{
	case 1: 
	 System.out.println("The value of a is 1");
	 break;

	case 2: 
	 System.out.println("The value of a is 2");
	 break;

	case 3: 
	 System.out.println("The value of a is 3");
	 break;

	default:
	 System.out.println("The value of a is unknown");
	 break;
	}
	}
}
}