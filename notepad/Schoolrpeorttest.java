import java.util.Scanner;
public class Schoolrpeorttest
{
	public static void main(String args[]){
	Scanner Jimmy = new Scanner(System.in);

        int total = 0, average, counter = 0;

        while(counter < 10) {
            total += Jimmy.nextInt();
            counter++;
        }
        average = total / 10;
        System.out.println("Your average = " + average);
	}
}