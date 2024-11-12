package task1;

public class ArrayCopy {

	public static void main(String[] args) {
		int[]a = {34,45,67,44,23};
		int[]b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, 5);
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
