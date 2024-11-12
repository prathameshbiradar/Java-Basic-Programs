package task1;

public class Array {

	public static void printArray(int[]arr)
	{
		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[]arr = {11,12,13,14,15,16,17};
		printArray(arr);
		System.out.println();
		//fpr-each loop
		for(int num : arr)
		{
			System.out.print(num+" ");
		}

	}

}
