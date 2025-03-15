public class ArrayTest
{
	public static void main(String args[]){ 
        int[] array1 = new int[] {1, 2, 3};
	array1[0] = 2;
	array1[1] = 5;
	System.out.println("The value of the first array is... " +array1[0]);
	System.out.println("The value of the first array is... " +array1[1]);

	int[] array2 = new int[420];
	array2[419] = 3;
	System.out.println("The value of array 419 of the second array is... " +array2[419]);
    }
} 
