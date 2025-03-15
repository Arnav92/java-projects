public class RandomMultiDimensionalArrayDisplay
{
    public static void main(String args[]){
	int array1[][]={{1,2,3,4,6},{2,4,2,4,56}};
	int array2[][]={{32,2,2,5,3,2,3424,1},{45,4,5,32,5,4}, {328803, 3482, 3209}};
	
	System.out.println("First chart");
	show(array1);

	System.out.println("Second chart");
	show(array2);
}
	public static void show(int a[][]){
	for(int row=0;row<a.length;row++){
	for(int column=0;column<a[row].length;column++){
	System.out.print(a[row][column]+"\r");
	}
	System.out.println();
	}
}
}	
