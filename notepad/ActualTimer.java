import java.util.concurrent.TimeUnit;
public class ActualTimer {
	public static void main (String args[]) {
	PrintTime a = new PrintTime();
}
}

class PrintTime {
	public PrintTime () {
	for (int x = 3; x >= 1; x--) {
	System.out.printf("%s \n", x);
	try {
	Thread.sleep(1000);

	if (x == 1) {
	System.out.println("0");
	System.out.println("Time is up!!");
}
	}
	catch (InterruptedException ie){
	Thread.currentThread().interrupt();
	}
} 
}
}