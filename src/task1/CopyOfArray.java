package task1;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int[]a = {23,6,34,76};
		int[]b =Arrays.copyOf(a, 2);
		b[0]++;
		
		System.out.println("printing array a[]");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("printing array b[]");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
