public class concluded{
	public static void main (String args[]){
	final2 getvalue = new final2(23);
	getvalue.sum();
	System.out.printf("%s", getvalue);
}
}

class final2{
	private int sum;
	private final int finale;
	public final2(int a){
	finale = a;
}
	public void sum(){
	sum+=finale;
}
	public String getSUM(){
	return String.format("%d", sum);
}
}