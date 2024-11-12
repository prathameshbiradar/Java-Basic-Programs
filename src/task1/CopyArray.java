package task1;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {16,18,19};
		int []b = new int[a.length];
		
		b=a;
		
		b[0]++;
		System.out.println("printing a[] is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Printing b[] is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		int[]c = {12,24,36};
		int[]d = new int[a.length];
		
		for(int i=0;i<c.length;i++)
		{
			d[i]=c[i];
		}
		d[0]++;
		System.out.println();
		System.out.println("printing d[] is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		System.out.println();
		System.out.println("printing c[] is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
