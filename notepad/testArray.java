import java.util.Random;
public class testArray {

 public static void main(String[] args) {
  int bucky[] = new int[500];
  int x=3;
  int count=0, random;
  
  Random ran = new Random(10);
  
  random = ran.nextInt()+1;
  
  for (int a=0; a < bucky.length ; a++)
  {
   bucky[a]=ran.nextInt(20)+1;
   System.out.println(bucky[a]);
  }
  
  for (int i =0 ; i < 500 ; i++)
  {
   if(bucky[i]== x)
    count++;
  }
  System.out.println("Number of times 3 comes up in the array: " +count);
}
}