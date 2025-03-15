import java.util.Scanner;
public class Schoolreport
{
    public static void main(String args[]) {
	Scanner Jim = new Scanner (System.in);
	System.out.println("You are the teacher of one student, and you only grade this student. It's the end of the year, so now you will need to give an overall average grade (your student has took exactly 10 tests the whole year). This program will support you on your mission!");
	int grade, total, average;
	int test = 10;
	int counter = 0;
	
	while (counter<10)
	grade = Jim.nextInt();
	counter++;
}
	average = grade/test;
	System.out.println("The average of your student is: "+average);	
}
