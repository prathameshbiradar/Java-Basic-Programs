package task1;

public class MultiDimen {

	public static void initialization(int[][]arr)
	{
		int a = 1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		printArray(arr);
	}
	public static void printArray(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[][]arr = new int[3][4];
		
		initialization(arr);
		

	}

}
